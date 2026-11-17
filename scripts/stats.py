"""Testes estatísticos sobre results/metrics.csv (uma linha por programa).
Colunas esperadas: tech, model, spec, compiled_strict, compiled, ran, e as métricas numéricas abaixo."""
import itertools
import sys
import numpy as np
import pandas as pd
from scipy import stats

TECH = sys.argv[1] if len(sys.argv) > 1 else "P1"
BINARIAS = ["compiled_strict", "compiled", "ran"]
# Métricas de código-fonte (CK, AST, entidades): existem para os 90 programas -> análise pareada por especificação.
NUMERICAS = ["cc_mean", "lcom_mean", "nom_mean", "npm_mean", "wmc_mean", "cbo_mean",
             "ast_nodes", "ast_depth", "entity_cov"]
# Métricas do SonarQube: só existem para quem compilou -> comparação sem pareamento no subconjunto que compila.
SONAR = ["cogc_mean", "smells", "ncloc"]

df = pd.read_csv("results/metrics.csv")
df = df[df.tech == TECH]
modelos = sorted(df.model.unique())


def holm(pvals):
    """Correção de Holm-Bonferroni; devolve p ajustados na ordem original."""
    p = np.array(pvals, float)
    ordem = np.argsort(p)
    aj = np.empty_like(p)
    corrente = 0.0
    for rank, i in enumerate(ordem):
        corrente = max(corrente, (len(p) - rank) * p[i])
        aj[i] = min(1.0, corrente)
    return aj


def cliffs_delta(a, b):
    a, b = np.asarray(a), np.asarray(b)
    return (np.sum(a[:, None] > b[None, :]) - np.sum(a[:, None] < b[None, :])) / (len(a) * len(b))


def cochran_q(wide):
    """Q de Cochran para k condições binárias pareadas (wide: linhas = specs)."""
    x = wide.to_numpy(dtype=float)
    k = x.shape[1]
    col, lin = x.sum(axis=0), x.sum(axis=1)
    n_total = x.sum()
    denom = k * n_total - (lin ** 2).sum()
    if denom == 0:
        return float("nan"), float("nan")
    q = (k - 1) * (k * (col ** 2).sum() - n_total ** 2) / denom
    return q, stats.chi2.sf(q, k - 1)


print(f"== Técnica {TECH} | modelos: {modelos} ==\n")
for m in BINARIAS:
    wide = df.pivot(index="spec", columns="model", values=m).dropna()
    q, p = cochran_q(wide)
    print(f"[{m}] taxa por modelo: {wide.mean().round(3).to_dict()}  Cochran Q={q:.3f} p={p:.4f}")
print()
def sem_pareamento(sub, m, rotulo):
    grupos = {mo: sub[sub.model == mo][m].dropna() for mo in modelos}
    if min(len(v) for v in grupos.values()) < 3:
        print(f"  [{rotulo}] amostra pequena demais {({k: len(v) for k, v in grupos.items()})}; pulei")
        return
    print(f"  [{rotulo}] n={ {k: len(v) for k, v in grupos.items()} } "
          f"mediana={ {k: round(float(v.median()), 2) for k, v in grupos.items()} }")
    try:
        kw = stats.kruskal(*grupos.values())
        print(f"    Kruskal-Wallis p={kw.pvalue:.4f}")
    except ValueError:
        print("    Kruskal-Wallis: valores todos iguais")
        return
    pares_u = list(itertools.combinations(modelos, 2))
    pu = [stats.mannwhitneyu(grupos[a], grupos[b], alternative="two-sided").pvalue for a, b in pares_u]
    for (a, b), padj, praw in zip(pares_u, holm(pu), pu):
        print(f"    {a} vs {b}: Mann-Whitney U p={praw:.4f} (Holm {padj:.4f}) "
              f"Cliff delta={cliffs_delta(grupos[a], grupos[b]):+.2f}")


print("##### A) Métricas de código-fonte: todos os programas, pareado por especificação #####\n")
for m in NUMERICAS:
    wide = df.pivot(index="spec", columns="model", values=m).dropna()
    if len(wide) < 6:
        print(f"[{m}] poucas especificações completas ({len(wide)}); pulei\n")
        continue
    print(f"[{m}] n={len(wide)} especificações completas nos {len(modelos)} modelos")
    print("  mediana:", wide.median().round(2).to_dict(), "| IIQ:",
          (wide.quantile(.75) - wide.quantile(.25)).round(2).to_dict())
    print("  Shapiro-Wilk p:", {c: round(float(stats.shapiro(wide[c]).pvalue), 4) for c in wide})
    fr = stats.friedmanchisquare(*[wide[c] for c in wide])
    print(f"  Friedman chi2={fr.statistic:.3f} p={fr.pvalue:.4f}")
    pares = list(itertools.combinations(wide.columns, 2))
    ps = [stats.wilcoxon(wide[a], wide[b]).pvalue if (wide[a] != wide[b]).any() else 1.0
          for a, b in pares]
    for (a, b), padj, praw in zip(pares, holm(ps), ps):
        print(f"  {a} vs {b}: Wilcoxon p={praw:.4f} (Holm {padj:.4f}) "
              f"Cliff delta={cliffs_delta(wide[a], wide[b]):+.2f}")
    sem_pareamento(df[df.compiled == 1], m, "sensibilidade: só quem compila, sem pareamento")
    print()

print("##### B) Métricas do SonarQube: só programas que compilam, sem pareamento #####\n")
for m in SONAR:
    print(f"[{m}]")
    sem_pareamento(df[df.compiled == 1], m, "programas que compilam")
    print()
