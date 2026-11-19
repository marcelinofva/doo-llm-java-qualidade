"""Estatisticas da avaliacao manual (results/manual/avaliacao_manual.csv).
Uso (na raiz do repositorio): python scripts/manual_stats.py
Gera: results/manual_stats.txt e results/figures/manual.png

Medidas por programa (30 especificacoes x 3 modelos, pareadas por especificacao):
  - taxa_historias = historias_atendidas / n_historias
  - fluxo_coerente_0_1 (binaria)
  - qualidade_oo_0_2 (ordinal)
Testes: Friedman (3 modelos) para taxa e qualidade OO, Cochran Q para o fluxo,
Wilcoxon pareado entre pares de modelos com correcao de Holm (por medida),
delta de Cliff como tamanho de efeito."""
import itertools
import os
import sys
import io
import matplotlib
matplotlib.use("Agg")
import matplotlib.pyplot as plt
import numpy as np
import pandas as pd
from scipy import stats

CSV = "results/manual/avaliacao_manual.csv"
df = pd.read_csv(CSV)
df["taxa_historias"] = df.historias_atendidas / df.n_historias
modelos = ["llama", "phi", "qwen"]
out = io.StringIO()


def p(*a):
    print(*a, file=out)


def holm(pv):
    pv = np.asarray(pv, float)
    ordem = np.argsort(pv)
    aj = np.empty_like(pv)
    mx = 0.0
    for i, k in enumerate(ordem):
        mx = max(mx, (len(pv) - i) * pv[k])
        aj[k] = min(1.0, mx)
    return aj


def cliff(x, y):
    x, y = np.asarray(x), np.asarray(y)
    gt = sum((a > y).sum() for a in x)
    lt = sum((a < y).sum() for a in x)
    return (gt - lt) / (len(x) * len(y))


def pareado(col):
    w = df.pivot(index="spec", columns="model", values=col)[modelos]
    return w.dropna()


p("AVALIACAO MANUAL - estatisticas (n = %d programas, %d por modelo)" % (len(df), len(df) // 3))
p("Fonte: " + CSV + " | avaliacao feita com apoio do Claude e conferida em amostra (ver docs/decisoes.md)\n")

p("== Resumo por modelo ==")
res = df.groupby("model").agg(
    historias=("historias_atendidas", "sum"), total=("n_historias", "sum"),
    taxa_media=("taxa_historias", "mean"), fluxo_ok=("fluxo_coerente_0_1", "sum"),
    oo_media=("qualidade_oo_0_2", "mean")).reindex(modelos)
res["taxa_global_%"] = 100 * res.historias / res.total
p(res.round(3).to_string())
p()

for col, nome in [("taxa_historias", "Taxa de historias atendidas"), ("qualidade_oo_0_2", "Qualidade OO (0-2)")]:
    w = pareado(col)
    p(f"== {nome} (n={len(w)} especificacoes pareadas) ==")
    chi, pf = stats.friedmanchisquare(*[w[m] for m in modelos])
    p(f"Friedman: chi2={chi:.3f}, p={pf:.4f}")
    pares = list(itertools.combinations(modelos, 2))
    praw = []
    for a, b in pares:
        try:
            praw.append(stats.wilcoxon(w[a], w[b]).pvalue)
        except ValueError:
            praw.append(1.0)
    for (a, b), pr, pa in zip(pares, praw, holm(praw)):
        p(f"  {a} vs {b}: Wilcoxon p={pr:.4f} (Holm {pa:.4f}); delta de Cliff={cliff(w[a], w[b]):+.3f}")
    p()

w = pareado("fluxo_coerente_0_1")
p(f"== Fluxo coerente (0/1) (n={len(w)} especificacoes pareadas) ==")
k = w.shape[1]
T = w.sum(axis=0).values
S = w.sum(axis=1).values
den = k * S.sum() - (S ** 2).sum()
if den > 0:
    q = (k - 1) * (k * (T ** 2).sum() - S.sum() ** 2) / den
    p(f"Cochran Q={q:.3f}, p={stats.chi2.sf(q, k - 1):.4f}")
else:
    p("Cochran Q indefinido (sem variacao)")
p("Fluxo coerente por modelo: " + ", ".join(f"{m}={int(w[m].sum())}/{len(w)}" for m in modelos))
p()
p("Cautelas: avaliador unico (com apoio de IA); a conferencia de 6 programas nao e independente;")
p("diferencas pequenas devem ser lidas com cuidado (varios testes; n=30 por modelo).")

os.makedirs("results/figures", exist_ok=True)
txt = out.getvalue()
open("results/manual_stats.txt", "w", encoding="utf-8").write(txt)
print(txt)

fig, ax = plt.subplots(1, 3, figsize=(10, 3.4))
ax[0].boxplot([pareado("taxa_historias")[m] for m in modelos])
ax[0].set_title("Taxa de historias atendidas")
ax[1].bar(modelos, [df[df.model == m].fluxo_coerente_0_1.sum() for m in modelos])
ax[1].set_title("Fluxo coerente (de 30)")
ax[2].boxplot([pareado("qualidade_oo_0_2")[m] for m in modelos])
ax[2].set_title("Qualidade OO (0-2)")
for a in (ax[0], ax[2]):
    a.set_xticks(range(1, 4))
    a.set_xticklabels(modelos)
plt.tight_layout()
plt.savefig("results/figures/manual.png", dpi=200)
print("Figura: results/figures/manual.png")
