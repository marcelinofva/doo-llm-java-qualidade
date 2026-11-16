"""Cobertura de entidades: fração das entidades esperadas (specs/Sxx.entities.txt, uma por linha)
que aparece como nome de classe gerada. Também calcula a precisão (classes que correspondem a entidades)."""
import csv
import pathlib
import re


def norm(s):
    s = re.sub(r"[^a-z]", "", s.lower())
    return re.sub(r"(ies)$", "y", re.sub(r"(s)$", "", s)) if len(s) > 3 else s


def casa(entidade, classe):
    return entidade == classe or entidade in classe or classe in entidade


rows = []
for d in sorted(pathlib.Path("outputs").glob("*/*/*")):
    tech, model, spec = d.parent.parent.name, d.parent.name, d.name
    gt = pathlib.Path(f"specs/{spec}.entities.txt")
    if not gt.exists() or not (d / "src").exists():
        continue
    ent = [norm(x) for x in gt.read_text(encoding="utf-8").splitlines() if x.strip()]
    cls = [norm(f.stem) for f in (d / "src").glob("*.java") if f.stem != "Main"]
    cob = sum(any(casa(e, c) for c in cls) for e in ent) / len(ent) if ent else 0
    prec = sum(any(casa(e, c) for e in ent) for c in cls) / len(cls) if cls else 0
    rows.append([tech, model, spec, round(cob, 3), round(prec, 3)])

with open("results/entities.csv", "w", newline="", encoding="utf-8") as f:
    w = csv.writer(f)
    w.writerow(["tech", "model", "spec", "entity_cov", "entity_prec"])
    w.writerows(rows)
print(len(rows), "programas")
