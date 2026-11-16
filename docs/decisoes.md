# Decisoes e desvios do plano

| Data | O que mudou | Por que | Impacto |
| --- | --- | --- | --- |
| 2026-11-15 | extract.py passou a ler as cercas de codigo linha a linha | O llama escreveu o bloco de design dentro de uma cerca xml e o extrator antigo pegava titulos em vez de codigo (0 arquivos extraidos) | Corrige um defeito do meu extrator; as respostas brutas (raw.txt) nao foram alteradas |
| 2026-11-16 | extract.py separa um bloco com varios arquivos pelo cabecalho // File: Nome.java | O phi juntou varios arquivos em um unico bloco, separados pelo cabecalho pedido no prompt | Regra igual para os tres modelos |
| 2026-11-16 | compile_run.py registra duas taxas: compiled_strict (como escrito) e compiled (apos reparo mecanico de imports) | Os modelos omitem imports (List, ArrayList, Map etc.); sem o reparo quase nada compilaria e as metricas ficariam sem dados | O reparo so acrescenta imports que o proprio javac apontou, de uma lista fixa; as duas taxas serao reportadas; original guardado em orig_src |
| 2026-11-16 | Prompt P1 v2: regra de que cada arquivo inclua todos os imports | Falta de imports foi o erro mais comum no piloto | Regra geral de formato; os modelos a seguiram de forma inconsistente |
| 2026-11-16 | Piloto (S01-S03 x 3 modelos) descartado; todos os programas serao gerados de novo com o prompt congelado | O prompt mudou durante o piloto | Nenhum resultado do piloto entra na analise final |

Observacao do piloto: erros reais dos modelos (metodo chamado e nao escrito, return ausente, variavel declarada duas vezes) ficam como falha de compilacao e nao sao corrigidos.
