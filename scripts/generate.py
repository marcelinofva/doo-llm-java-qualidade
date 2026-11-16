"""Gera 1 programa por (modelo, especificação) usando o Ollama local.
Primeira resposta, sem realimentação (mesmo critério do artigo-base).
Pode ser interrompido e retomado: pula o que já foi gerado."""
import csv
import pathlib
import sys
import requests

OLLAMA = "http://localhost:11434/api/generate"
MODELS = {                      # apelido -> tag no Ollama
    "qwen": "qwen2.5-coder:7b",
    "llama": "llama3.1:8b",
    "phi": "phi4-mini",
}
PROMPT_FILE = sys.argv[1] if len(sys.argv) > 1 else "prompts/P1.txt"
TECH = pathlib.Path(PROMPT_FILE).stem          # P1 ou P0
OPTIONS = {"temperature": 0.1, "seed": 42, "num_ctx": 8192, "num_predict": 4096}


def call(tag, prompt):
    r = requests.post(OLLAMA, json={"model": tag, "prompt": prompt,
                                    "stream": False, "options": OPTIONS},
                      timeout=3600)
    r.raise_for_status()
    return r.json()


def main():
    template = pathlib.Path(PROMPT_FILE).read_text(encoding="utf-8")
    specs = sorted(pathlib.Path("specs").glob("S*.md"))
    log = pathlib.Path("logs/generation.csv")
    log.parent.mkdir(exist_ok=True)
    novo = not log.exists()
    with log.open("a", newline="", encoding="utf-8") as f:
        w = csv.writer(f)
        if novo:
            w.writerow(["tech", "model", "spec", "tokens", "gen_s", "tok_per_s", "done_reason"])
        for key, tag in MODELS.items():          # um modelo por vez
            for spec in specs:
                out = pathlib.Path(f"outputs/{TECH}/{key}/{spec.stem}/raw.txt")
                if out.exists():
                    continue
                out.parent.mkdir(parents=True, exist_ok=True)
                d = call(tag, template.replace("{{SPEC}}", spec.read_text(encoding="utf-8")))
                out.write_text(d["response"], encoding="utf-8")
                toks = d.get("eval_count", 0)
                secs = d.get("eval_duration", 0) / 1e9
                w.writerow([TECH, key, spec.stem, toks, round(secs, 1),
                            round(toks / secs, 1) if secs else 0, d.get("done_reason", "")])
                f.flush()
                print(TECH, key, spec.stem, "ok", flush=True)


if __name__ == "__main__":
    main()
