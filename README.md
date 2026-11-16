# Pipeline do trabalho de DOO: código Java gerado por LLMs locais

Tudo roda na sua máquina, sem API paga e sem limite de uso.

## Ordem de execução
0. `python scripts/registrar_ambiente.py` (gera `docs/ambiente.md`; rode no início e de novo no fim; complete os campos MANUAL).
1. `ollama pull qwen2.5-coder:7b`, `ollama pull llama3.1:8b`, `ollama pull phi4-mini` (confira as tags em ollama.com/library).
2. Coloque as 30 especificações em `specs/S01.md` ... `S30.md` e as entidades esperadas em `specs/S01.entities.txt` ... (modelos em `specs/_TEMPLATE*`).
3. Piloto: copie 3 a 5 especificações para uma pasta à parte e rode os passos 4 a 6 nelas para validar o prompt.
4. `python scripts/generate.py prompts/P1.txt`   (pode interromper e retomar; pula o que já foi gerado)
5. `python scripts/extract.py`
6. `python scripts/compile_run.py`   (javac --release 11 + execução da Main com limite de 10 s)
7. `java -jar ck.jar outputs false 0 false results/ck/`   (CK; crie `results/ck` antes)
8. `java -cp javaparser-core-<versão>.jar scripts/AstMetrics.java outputs > results/ast.csv`
9. SonarQube local (Docker): suba o servidor, crie um token e rode `python scripts/sonar_scan.py <TOKEN>`
10. `python scripts/entity_cov.py`
11. `python scripts/merge_metrics.py`   (gera `results/metrics.csv`)
12. `python scripts/stats.py P1`
13. `python scripts/plots.py P1`   (gera `results/figures/taxas.png` e `box_<métrica>.png` para o relatório)

Extensão opcional: `python scripts/generate.py prompts/P0.txt` (zero-shot) e repita os passos 5 a 12 com `P0`.

## Status dos testes (feitos no ambiente de montagem, sem Ollama)
- Testados com dados simulados: generate.py (contra um servidor Ollama falso), extract.py, entity_cov.py, merge_metrics.py, stats.py, plots.py, registrar_ambiente.py.
- Testado com JDK 21 real: compile_run.py (casos: compila e executa, erro de compilação, exceção, timeout, sem Main, sem arquivos). Com o seu JDK 25 o `--release 11` funciona do mesmo jeito.
- sonar_scan.py: ajustado para achar `sonar-scanner.bat` no Windows e seguir em frente se um programa falhar, mas não foi testado contra um SonarQube real.
- Não testados: a parte do SonarQube (precisa do servidor), AstMetrics.java (precisa do jar do JavaParser) e a chamada do CK. Rode primeiro no piloto e ajuste nomes de colunas dos CSVs do CK se a sua versão for diferente.

## Cuidados
- O código gerado é executado: rode em pasta temporária (o script já faz) e não use a máquina com dados sensíveis abertos durante a execução.
- Registre as versões: `ollama --version`, `ollama show <modelo>` (digest), `java -version`, versão do CK, do JavaParser e do SonarQube.
- Instale as dependências Python com `pip install -r requirements.txt`.
