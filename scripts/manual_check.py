"""Prepara a verificação manual de assertividade: sorteia 10 especificações (semente fixa, para ser
reproduzível e sem escolher as 'boas') e gera, por especificação, um resumo com as histórias, a lista de
classes e métodos públicos de cada modelo e o resultado de compilação/execução.
Saída: results/manual/avaliacao_manual.csv (para preencher) e results/manual/Sxx.md (para ler).
Uso: python scripts/manual_check.py [P1] [semente=42] [n_especificacoes=10]   (use 30 para avaliar todas)"""
import csv
import pathlib
import random
import re
import sys

import pandas as pd

TECH = sys.argv[1] if len(sys.argv) > 1 else "P1"
SEED = int(sys.argv[2]) if len(sys.argv) > 2 else 42
N = int(sys.argv[3]) if len(sys.argv) > 3 else 10
MODELOS = ["qwen", "llama", "phi"]
out = pathlib.Path("results/manual")
out.mkdir(parents=True, exist_ok=True)

specs = sorted(p.stem for p in pathlib.Path("specs").glob("S[0-9][0-9].md"))
amostra = sorted(random.Random(SEED).sample(specs, min(N, len(specs))))
build = pd.read_csv("results/build.csv")

DECL = re.compile(r"^\s*(?:public\s+|abstract\s+|final\s+)*(class|interface|enum)\s+(\w+)")
METODO = re.compile(r"^\s*public\s+(?!class|interface|enum)[\w<>\[\],\s?]+?\s+\w+\s*\([^)]*\)")


def resumo(src):
    linhas = []
    for f in sorted(src.glob("*.java")):
        for ln in f.read_text(encoding="utf-8", errors="replace").splitlines():
            if DECL.match(ln):
                linhas.append(f"- **{ln.strip().rstrip('{').strip()}**")
            elif METODO.match(ln):
                linhas.append(f"    - `{ln.strip().rstrip('{').strip()}`")
    return "\n".join(linhas) or "(sem arquivos)"


linhas_csv = []
for sid in amostra:
    txt = pathlib.Path(f"specs/{sid}.md").read_text(encoding="utf-8")
    historias = [l for l in txt.splitlines() if re.match(r"^US\d+:", l)]
    md = [f"# {sid} - verificação manual\n", "## Histórias\n"] + [f"- {h}" for h in historias] + [""]
    for mo in MODELOS:
        b = build[(build.model == mo) & (build.spec == sid)]
        st = "?" if b.empty else f"compilou={int(b.compiled.iloc[0])} executou={int(b.ran.iloc[0])}"
        md += [f"## {mo} ({st})\n", f"Pasta: `outputs/{TECH}/{mo}/{sid}/src`\n",
               resumo(pathlib.Path(f"outputs/{TECH}/{mo}/{sid}/src")), ""]
        linhas_csv.append([TECH, mo, sid, len(historias), "", "", "", ""])
    (out / f"{sid}.md").write_text("\n".join(md), encoding="utf-8")

with open(out / "avaliacao_manual.csv", "w", newline="", encoding="utf-8") as f:
    w = csv.writer(f)
    w.writerow(["tech", "model", "spec", "n_historias", "historias_atendidas", "fluxo_coerente_0_1",
                "qualidade_oo_0_2", "observacoes"])
    w.writerows(linhas_csv)
print(f"{len(amostra)} especificações (semente {SEED}):", ", ".join(amostra))
