"""Compila com javac (--release 11), executa a Main (timeout 10 s) e grava results/build.csv.

Duas taxas de compilação (as duas vão para o relatório):
  compiled_strict = compilou exatamente como o modelo escreveu;
  compiled        = compilou como escrito OU depois de um reparo MECÂNICO de imports.
O reparo só acrescenta 'import java.util.List;' e similares quando o próprio javac aponta
'cannot find symbol: class List' (lista KNOWN abaixo). Não corrige lógica, nomes nem métodos.
O original fica em orig_src/ e o que foi acrescentado em repair.log. Igual para todos os modelos."""
import csv
import pathlib
import re
import shutil
import subprocess
import tempfile

KNOWN = {
    "List": "java.util.List", "ArrayList": "java.util.ArrayList", "LinkedList": "java.util.LinkedList",
    "Map": "java.util.Map", "HashMap": "java.util.HashMap", "TreeMap": "java.util.TreeMap",
    "Set": "java.util.Set", "HashSet": "java.util.HashSet", "Collection": "java.util.Collection",
    "Collections": "java.util.Collections", "Arrays": "java.util.Arrays", "Optional": "java.util.Optional",
    "Iterator": "java.util.Iterator", "Objects": "java.util.Objects", "UUID": "java.util.UUID",
    "Comparator": "java.util.Comparator", "LocalDate": "java.time.LocalDate",
    "LocalDateTime": "java.time.LocalDateTime", "LocalTime": "java.time.LocalTime",
    "Duration": "java.time.Duration", "BigDecimal": "java.math.BigDecimal",
}
ERRO = re.compile(r"^(\S.*?\.java):\d+: error: cannot find symbol\n.*\n.*\n\s+symbol:\s+class (\w+)", re.M)


def javac(files, cls):
    shutil.rmtree(cls, ignore_errors=True)
    cls.mkdir(parents=True)
    return subprocess.run(["javac", "--release", "11", "-d", str(cls), *files],
                          capture_output=True, text=True)


def reparar(src, log):
    """Acrescenta só os imports que o javac pediu e que estão em KNOWN. Devolve {arquivo: [imports]}."""
    faltam = {}
    for arq, simbolo in ERRO.findall(log):
        if simbolo in KNOWN:
            faltam.setdefault(pathlib.Path(arq).name, set()).add(simbolo)
    feito = {}
    for nome, simbolos in faltam.items():
        f = src / nome
        if not f.exists():
            continue
        linhas = f.read_text(encoding="utf-8").split("\n")
        pos = 1 if linhas and re.match(r"\s*//\s*File:", linhas[0]) else 0
        novos = [f"import {KNOWN[s]};" for s in sorted(simbolos)]
        linhas[pos:pos] = novos
        f.write_text("\n".join(linhas), encoding="utf-8")
        feito[nome] = novos
    return feito


rows = []
for d in sorted(pathlib.Path("outputs").glob("*/*/*")):
    tech, model, spec = d.parent.parent.name, d.parent.name, d.name
    src, cls, orig = d / "src", d / "classes", d / "orig_src"
    if orig.exists():                          # recomeça sempre do código original do modelo
        for f in orig.glob("*.java"):
            shutil.copy(f, src / f.name)
    files = sorted(str(f) for f in src.glob("*.java"))
    if not files:
        rows.append([tech, model, spec, 0, 0, 0, 0, 0, "sem_arquivos"])
        continue
    r = javac(files, cls)
    (d / "javac.log").write_text(r.stderr, encoding="utf-8")
    strict = int(r.returncode == 0)
    compiled, reparado = strict, 0
    if not strict:
        shutil.copytree(src, orig, dirs_exist_ok=True)
        feito = reparar(src, r.stderr)
        if feito:
            r2 = javac(files, cls)
            if r2.returncode == 0:
                compiled, reparado = 1, 1
                (d / "repair.log").write_text(
                    "\n".join(f"{n}: {' '.join(i)}" for n, i in feito.items()), encoding="utf-8")
            else:                              # reparo não bastou: volta ao original
                for f in orig.glob("*.java"):
                    shutil.copy(f, src / f.name)
                (d / "javac_apos_reparo.log").write_text(r2.stderr, encoding="utf-8")
        if not compiled:
            shutil.rmtree(cls, ignore_errors=True)
    ran, motivo = 0, ""
    if compiled and (cls / "Main.class").exists():
        try:   # roda numa pasta temporária, com tempo limite
            with tempfile.TemporaryDirectory() as tmp:
                p = subprocess.run(["java", "-cp", str(cls.resolve()), "Main"],
                                   capture_output=True, text=True, timeout=10,
                                   stdin=subprocess.DEVNULL, cwd=tmp)
            ran = int(p.returncode == 0)
            motivo = "" if ran else "excecao"
        except subprocess.TimeoutExpired:
            motivo = "timeout"
    elif compiled:
        motivo = "sem_Main"
    rows.append([tech, model, spec, len(files), strict, compiled, reparado, ran, motivo])

pathlib.Path("results").mkdir(exist_ok=True)
with open("results/build.csv", "w", newline="", encoding="utf-8") as f:
    w = csv.writer(f)
    w.writerow(["tech", "model", "spec", "n_files", "compiled_strict", "compiled", "repaired", "ran", "note"])
    w.writerows(rows)
print(len(rows), "programas processados")
