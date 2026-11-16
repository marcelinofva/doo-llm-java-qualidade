"""Roda o CK uma vez por programa (outputs/P1/<modelo>/<spec>/src) e junta tudo em
results/ck/class.csv e results/ck/method.csv.
Motivo: todos os programas usam o pacote padrão; rodando tudo junto, classes com o
mesmo nome (Main, Item...) de programas diferentes se sobrescrevem no relatório do CK.
Uso: python scripts/run_ck.py tools/ck-src/target/ck-0.7.1-SNAPSHOT-jar-with-dependencies.jar"""
import pathlib
import subprocess
import sys
import tempfile
import pandas as pd

JAR = sys.argv[1]
base = pathlib.Path("outputs/P1")
dest = pathlib.Path("results/ck")
dest.mkdir(parents=True, exist_ok=True)
acc = {"class": [], "method": []}
progs = sorted(p for p in base.glob("*/S*/src") if list(p.glob("*.java")))
for i, src in enumerate(progs, 1):
    with tempfile.TemporaryDirectory() as tmp:
        r = subprocess.run(["java", "-jar", JAR, str(src), "false", "0", "false", tmp + "/"],
                           capture_output=True, text=True)
        for nome in acc:
            f = pathlib.Path(tmp) / f"{nome}.csv"
            if f.exists() and f.stat().st_size > 0:
                try:
                    acc[nome].append(pd.read_csv(f))
                except pd.errors.EmptyDataError:
                    pass
    print(i, len(progs), src.parent.parent.name, src.parent.name, flush=True)
for nome, partes in acc.items():
    df = pd.concat(partes, ignore_index=True) if partes else pd.DataFrame()
    df.to_csv(dest / f"{nome}.csv", index=False, encoding="utf-8")
    print(nome, len(df), "linhas")
