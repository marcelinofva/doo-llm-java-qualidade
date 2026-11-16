# Ambiente de execução

Registrado em: 2026-11-15 21:17

## Máquina
- Sistema: Windows-10-10.0.19045-SP0
- Processador: AMD64 Family 25 Model 80 Stepping 0, AuthenticAMD
- Núcleos lógicos: 12
- RAM: 15.9 GB
- GPU (modelo e VRAM): AMD Radeon RX 7600, 8 GB de VRAM, driver 32.0.32015.7029

## Ferramentas
### Java (runtime)
```
openjdk version "25.0.4.1" 2026-08-18 LTS
OpenJDK Runtime Environment Zulu25.36+205-CA (build 25.0.4.1+1-LTS)
OpenJDK 64-Bit Server VM Zulu25.36+205-CA (build 25.0.4.1+1-LTS, mixed mode, sharing)
```
### Java (compilador)
```
javac 25.0.4.1
```
### Python
```
Python 3.12.10
```
### Git
```
git version 2.56.1.windows.1
```
### Maven
```
NÃO ENCONTRADO no PATH
```
### Docker
```
NÃO ENCONTRADO no PATH
```
### Ollama
```
ollama version is 0.40.16
```
### SonarScanner
```
NÃO ENCONTRADO no PATH
```

## Modelos locais (ollama list)
```
NAME                ID              SIZE      MODIFIED       
phi4-mini:latest    78fad5d182a7    2.5 GB    45 minutes ago    
llama3.1:8b         46e0c10c039e    4.9 GB    47 minutes ago    
qwen2.5-coder:7b    dae161e27b0e    4.7 GB    54 minutes ago
```
### ollama show qwen2.5-coder:7b
```
Model
    architecture        qwen2          
    parameters          7.6B           
    context length      32768          
    embedding length    3584           
    quantization        Q4_K_M         
    template source     go_template    

  Capabilities
    completion    
    tools         
    insert        

  System
    You are Qwen, created by Alibaba Cloud. You are a helpful assistant.    

  License
    Apache License               
    Version 2.0, January 2004    
    ...
```
### ollama show llama3.1:8b
```
Model
    architecture        llama          
    parameters          8.0B           
    context length      131072         
    embedding length    4096           
    quantization        Q4_K_M         
    template source     go_template    

  Capabilities
    completion    
    tools         

  Parameters
    stop    "<|start_header_id|>"    
    stop    "<|end_header_id|>"      
    stop    "<|eot_id|>"             

  License
    LLAMA 3.1 COMMUNITY LICENSE AGREEMENT            
    Llama 3.1 Version Release Date: July 23, 2024    
    ...
```
### ollama show phi4-mini
```
Model
    architecture        phi3           
    parameters          3.8B           
    context length      131072         
    embedding length    3072           
    quantization        Q4_K_M         
    template source     go_template    

  Capabilities
    completion    
    tools         

  License
    Microsoft.                              
    Copyright (c) Microsoft Corporation.    
    ...
```

## Preencher à mão
- CK: versão/commit usado e comando de build: MANUAL
- JavaParser: versão do jar: MANUAL
- SonarQube: versão (aparece no rodapé da página http://localhost:9000) e imagem Docker: MANUAL
- Parâmetros de geração: ver OPTIONS em scripts/generate.py (temperature 0.1, seed 42, num_ctx 8192, num_predict 4096)
