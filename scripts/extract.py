"""Separa o <design> e grava cada bloco de código Java como arquivo .java em src/.
Lê as cercas ``` linha a linha, então tolera <design> dentro de ```xml, títulos entre os blocos
e blocos sem a palavra 'java'. Só roda sobre o raw.txt já gerado: não altera nenhuma resposta."""
import pathlib
import re
import shutil

FENCE = re.compile(r"^\s*```\s*([\w+#-]*)\s*$")
DECL = re.compile(r"\b(?:class|interface|enum)\s+(\w+)")
HEADER = re.compile(r"^\s*//\s*File:\s*(\w+)\.java")


def blocos(texto):
    """Devolve [(linguagem, conteúdo)] de cada bloco cercado por ```."""
    saida, lang, buf = [], None, []
    for linha in texto.splitlines():
        m = FENCE.match(linha)
        if m and lang is None:                 # abre bloco (com ou sem linguagem)
            lang, buf = m.group(1).lower(), []
        elif m and m.group(1) == "":           # fecha bloco (``` sozinho)
            saida.append((lang, "\n".join(buf)))
            lang = None
        elif lang is not None:
            buf.append(linha)
    if lang in ("java", ""):                   # resposta cortada: guarda o que veio
        saida.append((lang, "\n".join(buf)))
    return saida


def partes(bloco):
    """Separa um bloco em arquivos nos cabeçalhos '// File: Nome.java' (vale para todos os modelos).
    Devolve [(nome ou None, texto)]. Um bloco sem cabeçalho volta inteiro."""
    saida, nome, buf = [], None, []
    for linha in bloco.splitlines():
        m = HEADER.match(linha)
        if m:
            saida.append((nome, "\n".join(buf)))
            nome, buf = m.group(1), [linha]
        else:
            buf.append(linha)
    saida.append((nome, "\n".join(buf)))
    return [(n, t) for n, t in saida if t.strip()]


def extract(raw_path):
    raw = raw_path.read_text(encoding="utf-8")
    m = re.search(r"<design>(.*?)</design>", raw, re.S)
    if m:
        (raw_path.parent / "design.txt").write_text(m.group(1).strip(), encoding="utf-8")
        raw = raw.replace(m.group(0), "")
    src = raw_path.parent / "src"
    src.mkdir(exist_ok=True)
    shutil.rmtree(raw_path.parent / "orig_src", ignore_errors=True)   # cópia do reparo de imports (compile_run)
    for velho in src.glob("*.java"):           # evita sobras de uma extração anterior
        velho.unlink()
    n = 0
    for lang, bloco in blocos(raw):
        if lang not in ("java", ""):
            continue
        for nome, texto in partes(bloco):
            c = DECL.search(texto)
            nome = nome or (c.group(1) if c else None)
            if nome and c:
                (src / f"{nome}.java").write_text(texto + "\n", encoding="utf-8")
                n += 1
    return n


if __name__ == "__main__":
    for p in sorted(pathlib.Path("outputs").glob("*/*/*/raw.txt")):
        print(p.parent, extract(p))
