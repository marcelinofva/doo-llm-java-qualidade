"""Gráficos para o relatório a partir de results/metrics.csv.
Uso: python scripts/plots.py [P1|P0]   -> results/figures/taxas.png e box_<métrica>.png"""
import os
import sys
import matplotlib
matplotlib.use("Agg")
import matplotlib.pyplot as plt
import pandas as pd

TECH = sys.argv[1] if len(sys.argv) > 1 else "P1"
METRICAS = ["cc_mean", "cogc_mean", "smells", "ncloc", "lcom_mean", "nom_mean", "npm_mean",
            "wmc_mean", "cbo_mean", "ast_nodes", "ast_depth", "entity_cov"]

df = pd.read_csv("results/metrics.csv")
df = df[df.tech == TECH]
modelos = sorted(df.model.unique())
os.makedirs("results/figures", exist_ok=True)

taxas = df.groupby("model")[["compiled", "ran"]].mean().reindex(modelos) * 100
ax = taxas.plot(kind="bar", figsize=(6, 4), rot=0)
ax.set_ylabel("% dos programas")
ax.set_ylim(0, 100)
ax.set_xlabel("")
ax.legend(["Compilou", "Executou"])
plt.tight_layout()
plt.savefig("results/figures/taxas.png", dpi=200)
plt.close()

for m in METRICAS:
    if m not in df.columns or df[m].dropna().empty:
        continue
    dados = [df[df.model == mod][m].dropna() for mod in modelos]
    plt.figure(figsize=(5, 3.5))
    plt.boxplot(dados)
    plt.xticks(range(1, len(modelos) + 1), modelos)
    plt.ylabel(m)
    plt.tight_layout()
    plt.savefig(f"results/figures/box_{m}.png", dpi=200)
    plt.close()
print("Figuras em results/figures/")
