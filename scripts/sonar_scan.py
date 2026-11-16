"""Roda o SonarScanner em cada programa que compilou e coleta as métricas pela API do SonarQube.
Uso: python scripts/sonar_scan.py <TOKEN>   (token em My Account > Security, no SonarQube local)"""
import csv
import pathlib
import shutil
import subprocess
import sys
import time
import requests

URL = "http://localhost:9000"
TOKEN = sys.argv[1]
# No Windows o executável é sonar-scanner.bat: subprocess só o acha pelo caminho completo.
SCANNER = shutil.which("sonar-scanner") or sys.exit("sonar-scanner não encontrado no PATH")
METRICAS = "ncloc,complexity,cognitive_complexity,code_smells"
auth = (TOKEN, "")


def medidas(key):
    for _ in range(40):            # espera o servidor processar o relatório (até ~80 s)
        r = requests.get(f"{URL}/api/measures/component", auth=auth,
                         params={"component": key, "metricKeys": METRICAS})
        if r.status_code == 200:
            m = {x["metric"]: x.get("value") for x in r.json()["component"]["measures"]}
            if "ncloc" in m:
                return m
        time.sleep(2)
    return None


rows = []
for d in sorted(pathlib.Path("outputs").glob("*/*/*")):
    if not list((d / "classes").glob("**/*.class")):
        continue                   # só programas que compilaram
    tech, model, spec = d.parent.parent.name, d.parent.name, d.name
    key = f"doo_{tech}_{model}_{spec}"
    r = subprocess.run([SCANNER, f"-Dsonar.projectKey={key}",
                        f"-Dsonar.sources={(d / 'src').resolve()}",
                        f"-Dsonar.java.binaries={(d / 'classes').resolve()}",
                        f"-Dsonar.host.url={URL}", f"-Dsonar.token={TOKEN}"],
                       cwd=d, capture_output=True, text=True)
    if r.returncode != 0:          # não interrompe o lote: registra a falha e segue
        print(key, "FALHOU:", (r.stdout + r.stderr)[-400:], flush=True)
        rows.append([tech, model, spec] + [None] * len(METRICAS.split(",")))
        continue
    m = medidas(key) or {}
    rows.append([tech, model, spec] + [m.get(k) for k in METRICAS.split(",")])
    print(key, m, flush=True)

with open("results/sonar.csv", "w", newline="", encoding="utf-8") as f:
    w = csv.writer(f)
    w.writerow(["tech", "model", "spec"] + METRICAS.split(","))
    w.writerows(rows)
