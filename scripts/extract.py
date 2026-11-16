"""Separa o <design> e grava cada bloco ```java como arquivo .java em src/."""
import pathlib
import re

FENCE = re.compile(r"```(?:java)?[ \t]*\n(.*?)```", re.S)
DECL = re.compile(r"\b(?:class|interface|enum)\s+(\w+)")


def extract(raw_path):
    raw = raw_path.read_text(encoding="utf-8")
    m = re.search(r"<design>(.*?)</design>", raw, re.S)
    if m:
        (raw_path.parent / "design.txt").write_text(m.group(1).strip(), encoding="utf-8")
        raw = raw.replace(m.group(0), "")
    src = raw_path.parent / "src"
    src.mkdir(exist_ok=True)
    n = 0
    for block in FENCE.findall(raw):
        h = re.match(r"\s*//\s*File:\s*(\w+)\.java", block)
        c = DECL.search(block)
        name = h.group(1) if h else (c.group(1) if c else None)
        if name:
            (src / f"{name}.java").write_text(block, encoding="utf-8")
            n += 1
    return n


if __name__ == "__main__":
    for p in sorted(pathlib.Path("outputs").glob("*/*/*/raw.txt")):
        print(p.parent, extract(p))
