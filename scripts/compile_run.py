"""Compila com javac (--release 11), executa a Main (timeout 10 s) e grava results/build.csv."""
import csv
import pathlib
import subprocess
import tempfile

rows = []
for d in sorted(pathlib.Path("outputs").glob("*/*/*")):
    tech, model, spec = d.parent.parent.name, d.parent.name, d.name
    files = sorted(str(f) for f in (d / "src").glob("*.java"))
    if not files:
        rows.append([tech, model, spec, 0, 0, 0, "sem_arquivos"])
        continue
    cls = d / "classes"
    cls.mkdir(exist_ok=True)
    r = subprocess.run(["javac", "--release", "11", "-d", str(cls), *files],
                       capture_output=True, text=True)
    (d / "javac.log").write_text(r.stderr, encoding="utf-8")
    compiled = int(r.returncode == 0)
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
    rows.append([tech, model, spec, len(files), compiled, ran, motivo])

pathlib.Path("results").mkdir(exist_ok=True)
with open("results/build.csv", "w", newline="", encoding="utf-8") as f:
    w = csv.writer(f)
    w.writerow(["tech", "model", "spec", "n_files", "compiled", "ran", "note"])
    w.writerows(rows)
print(len(rows), "programas processados")
