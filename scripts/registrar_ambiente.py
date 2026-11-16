"""Gera docs/ambiente.md com as versões de tudo que foi usado (exigência de reprodutibilidade).
Uso: python scripts/registrar_ambiente.py
Rode ANTES de gerar os programas e de novo ao final; confira os campos marcados como MANUAL."""
import datetime
import os
import platform
import shutil
import subprocess

COMANDOS = [
    ("Java (runtime)", ["java", "-version"]),
    ("Java (compilador)", ["javac", "-version"]),
    ("Python", ["python", "--version"]),
    ("Git", ["git", "--version"]),
    ("Maven", ["mvn", "-v"]),
    ("Docker", ["docker", "--version"]),
    ("Ollama", ["ollama", "--version"]),
    ("SonarScanner", ["sonar-scanner", "--version"]),
]
MODELOS = ["qwen2.5-coder:7b", "llama3.1:8b", "phi4-mini"]


def rodar(cmd):
    exe = shutil.which(cmd[0]) or (shutil.which("python3") if cmd[0] == "python" else None)
    if not exe:
        return "NÃO ENCONTRADO no PATH"
    try:
        r = subprocess.run([exe] + cmd[1:], capture_output=True, text=True, timeout=60)
        linhas = [x for x in (r.stdout + r.stderr).splitlines() if not x.startswith("Picked up")]
        saida = "\n".join(linhas).strip()
        return saida or "(sem saída)"
    except Exception as e:  # noqa: BLE001
        return f"erro: {e}"


def memoria_gb():
    try:
        if os.name == "nt":
            r = subprocess.run(["wmic", "computersystem", "get", "TotalPhysicalMemory"],
                               capture_output=True, text=True, timeout=30)
            n = [x for x in r.stdout.split() if x.isdigit()]
            return f"{int(n[0]) / 1024**3:.1f} GB" if n else "preencher manualmente"
        with open("/proc/meminfo") as f:
            kb = int(f.readline().split()[1])
        return f"{kb / 1024**2:.1f} GB"
    except Exception:  # noqa: BLE001
        return "preencher manualmente"


def main():
    os.makedirs("docs", exist_ok=True)
    L = ["# Ambiente de execução", "",
         f"Registrado em: {datetime.datetime.now():%Y-%m-%d %H:%M}", "",
         "## Máquina",
         f"- Sistema: {platform.platform()}",
         f"- Processador: {platform.processor() or 'preencher manualmente'}",
         f"- Núcleos lógicos: {os.cpu_count()}",
         f"- RAM: {memoria_gb()}",
         "- GPU (modelo e VRAM): MANUAL (Gerenciador de Tarefas > Desempenho)", "",
         "## Ferramentas"]
    for nome, cmd in COMANDOS:
        L += [f"### {nome}", "```", rodar(cmd), "```"]
    L += ["", "## Modelos locais (ollama list)", "```", rodar(["ollama", "list"]), "```"]
    for m in MODELOS:
        L += [f"### ollama show {m}", "```", rodar(["ollama", "show", m]), "```"]
    L += ["", "## Preencher à mão",
          "- CK: versão/commit usado e comando de build: MANUAL",
          "- JavaParser: versão do jar: MANUAL",
          "- SonarQube: versão (aparece no rodapé da página http://localhost:9000) e imagem Docker: MANUAL",
          "- Parâmetros de geração: ver OPTIONS em scripts/generate.py (temperature 0.1, seed 42, num_ctx 8192, num_predict 4096)"]
    with open("docs/ambiente.md", "w", encoding="utf-8") as f:
        f.write("\n".join(L) + "\n")
    print("Gravado em docs/ambiente.md")


if __name__ == "__main__":
    main()
