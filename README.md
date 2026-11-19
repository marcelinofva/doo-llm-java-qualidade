# Qualidade de código Java gerado por LLMs locais a partir de histórias de usuário

Trabalho da disciplina Desenvolvimento Orientado a Objetos (INF03068, 2026/2). Três modelos abertos executados localmente pelo Ollama geram código Java a partir de 30 especificações em forma de histórias de usuário. Os 90 programas resultantes são compilados, executados e analisados com métricas estáticas e uma avaliação manual de assertividade. Tudo roda em máquina local, sem API paga.

Versão entregue: etiqueta `v1.0-entrega`.

## Resumo dos resultados

| Modelo | Compilou (estrito) | Compilou (com reparo de imports) | Executou | Histórias atendidas (manual) | Qualidade OO (0 a 2) |
|---|---|---|---|---|---|
| qwen2.5-coder:7b | 8/30 | 15/30 | 15/30 | 63% | 1,73 |
| llama3.1:8b | 6/30 | 12/30 | 11/30 | 46% | 1,43 |
| phi4-mini | 6/30 | 10/30 | 9/30 | 50% | 0,63 |

As taxas de compilação não diferem de forma significativa entre os modelos (Q de Cochran). A diferença está na estrutura: o phi4-mini concentra o código em poucas classes grandes e cobre menos entidades do domínio. Complexidade ciclomática e cognitiva foram quase constantes. Detalhes e limitações estão no relatório e em `results/stats_P1.txt`.

## Estrutura

| Pasta | Conteúdo |
|---|---|
| `specs/` | 30 especificações (`Sxx.md`) e as entidades esperadas (`Sxx.entities.txt`, escolhidas pelo autor) |
| `prompts/` | prompt final `P1.txt`, versão anterior em `historico/` e linha base `P0.txt` (não executada) |
| `outputs/P1/<modelo>/<Sxx>/` | resposta bruta, projeto (`design.txt`), código extraído (`src/`), cópia original antes do reparo de imports (`orig_src/`) e log do `javac` |
| `scripts/` | pipeline de geração, compilação e análise |
| `results/` | métricas (`ast`, `ck/`, `sonar`, `entities`, `metrics`), estatística (`stats_P1.txt`), figuras e avaliação manual (`manual/`) |
| `logs/generation.csv` | tempo e tokens de cada geração |
| `docs/` | especificações (origem e licença), prompts (versões e hashes), decisões e ambiente |

## Como reproduzir

Pré-requisitos: Ollama, JDK (usado o 25, compilando com `--release 11`), Python 3.12, Maven (para compilar o CK) e Docker (para o SonarQube). Instale as dependências Python com `pip install -r requirements.txt`. As versões usadas estão em `docs/ambiente.md`.

1. `python scripts/registrar_ambiente.py` (gera `docs/ambiente.md`).
2. `ollama pull qwen2.5-coder:7b`, `ollama pull llama3.1:8b`, `ollama pull phi4-mini`.
3. `python scripts/generate.py prompts/P1.txt` (pode ser interrompido e retomado).
4. `python scripts/extract.py` e depois `python scripts/compile_run.py` (`javac --release 11`, execução da `Main` com limite de 10 s; gera `results/build.csv`).
5. AST: `java -cp javaparser-core-3.26.2.jar scripts/AstMetrics.java outputs > results/ast.csv`.
6. CK: compile o CK (0.7.1-SNAPSHOT) e rode `python scripts/run_ck.py <caminho do jar com dependências>` (um programa por vez, para evitar colisão de nomes de classe).
7. SonarQube local em Docker, com token criado na interface: `python scripts/sonar_scan.py <TOKEN>`. Não grave o token em arquivos.
8. `python scripts/entity_cov.py`, `python scripts/merge_metrics.py`, `python scripts/stats.py P1` e `python scripts/plots.py P1`.
9. Avaliação manual: `python scripts/manual_check.py P1 42 30` prepara os resumos e o CSV a preencher.

## Limitações

- Uma única resposta por combinação de especificação e modelo (semente 42, temperatura 0,1), sem medir variabilidade entre execuções.
- O prompt foi ajustado com S01 a S03, que fazem parte da amostra; não houve comparação com um prompt de linha base.
- Os `imports` ausentes foram reparados mecanicamente antes da segunda compilação; as duas taxas são reportadas.
- O SonarQube só analisa os programas que compilam (37 de 90).
- A avaliação manual foi feita por um único avaliador, com apoio do Claude (Anthropic) a partir de resumos estruturais do código, e uma amostra foi conferida pelo autor. As entidades esperadas também são escolha do autor.
- Todas as especificações vêm de um único conjunto de dados; 30 especificações de 14 sistemas.

## Dados e licença

As histórias de usuário vêm de Dalpiaz (2024), *Requirements data sets (user stories)*, Mendeley Data, DOI 10.17632/7zbk8zsd8y.2, licença CC BY 4.0. O código deste repositório está sob a licença MIT (`LICENSE`); os programas em `outputs/` foram gerados por modelos de linguagem.
