"""Junta build.csv, CK (class.csv e method.csv), Sonar, AST e entidades em results/metrics.csv.
Confira os nomes das colunas dos CSVs gerados pelas suas versões das ferramentas."""
import pandas as pd

KEY = ["tech", "model", "spec"]
RX = r"outputs[/\\]([^/\\]+)[/\\]([^/\\]+)[/\\]([^/\\]+)[/\\]src"


def com_chaves(df, col):
    df = df.copy()
    df[KEY] = df[col].astype(str).str.extract(RX)
    return df.dropna(subset=KEY)


build = pd.read_csv("results/build.csv")[KEY + ["compiled_strict", "compiled", "repaired", "ran"]]

ck = com_chaves(pd.read_csv("results/ck/class.csv"), "file")
g = ck.groupby(KEY)
cls = pd.DataFrame({
    "n_classes": g["class"].count(),
    "lcom_mean": g["lcom*"].mean(), "lcom_max": g["lcom*"].max(),
    "nom_mean": g["totalMethodsQty"].mean(), "npm_mean": g["publicMethodsQty"].mean(),
    "wmc_mean": g["wmc"].mean(), "cbo_mean": g["cbo"].mean(), "dit_max": g["dit"].max(),
    "total_methods": g["totalMethodsQty"].sum(),
}).reset_index()

mt = com_chaves(pd.read_csv("results/ck/method.csv"), "file")   # wmc no nível do método = CC do método
cc = mt.groupby(KEY)["wmc"].agg(cc_mean="mean", cc_max="max").reset_index()

sonar = pd.read_csv("results/sonar.csv")      # tech, model, spec, ncloc, complexity, cognitive_complexity, code_smells
sonar = sonar.rename(columns={"code_smells": "smells"})

ast = pd.read_csv("results/ast.csv")
ast = ast[~ast["file"].str.contains("orig_src")]          # orig_src = copia pre-reparo
ast = com_chaves(ast, "file")
ast = ast[ast.parsed == 1].groupby(KEY).agg(ast_nodes=("nodes", "sum"), ast_depth=("depth", "max"),
                                            n_interfaces=("interfaces", "sum"), n_extends=("extends", "sum"),
                                            n_try=("try_catch", "sum"), private_fields=("private_fields", "sum"),
                                            fields=("fields", "sum")).reset_index()

ent = pd.read_csv("results/entities.csv")

m = build
for outro in (cls, cc, sonar, ast, ent):
    m = m.merge(outro, on=KEY, how="left")
m["cogc_mean"] = m["cognitive_complexity"] / m["total_methods"]       # cognitiva média por método
m["encaps_ratio"] = m["private_fields"] / m["fields"]                 # proporção de atributos privados
m.to_csv("results/metrics.csv", index=False)
print(m.shape, "linhas x colunas ->", "results/metrics.csv")
