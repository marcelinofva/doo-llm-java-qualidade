# Ambiente de execução

Registrado em: 2026-11-17 00:26

## Máquina
- Sistema: Windows-10-10.0.19045-SP0
- Processador: AMD64 Family 25 Model 80 Stepping 0, AuthenticAMD
- Núcleos lógicos: 12
- RAM: 15.9 GB
- GPU: AMD Radeon RX 7600, 8 GB de VRAM

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
Apache Maven 3.9.9 (8e8579a9e76f7d015ee5ec7bfcdc97d260186937) (versao portatil em tools\, fora do PATH global)
```
### Docker
```
Docker version 29.9.3, build 5457199
```
### Ollama
```
ollama version is 0.40.16
```
### SonarScanner
```
00:26:14.649 INFO  Scanner configuration file: C:\Users\MarcelinoFVA\projetos\doo-llm-pipeline\tools\sonar-scanner-6.2.1.4610-windows-x64\bin\..\conf\sonar-scanner.properties
00:26:14.653 INFO  Project root configuration file: NONE
00:26:14.665 INFO  SonarScanner CLI 6.2.1.4610
00:26:14.666 INFO  Java 17.0.12 Eclipse Adoptium (64-bit)
00:26:14.667 INFO  Windows 10 10.0 amd64
```

## Modelos locais (ollama list)
```
NAME                ID              SIZE      MODIFIED     
phi4-mini:latest    78fad5d182a7    2.5 GB    28 hours ago    
llama3.1:8b         46e0c10c039e    4.9 GB    28 hours ago    
qwen2.5-coder:7b    dae161e27b0e    4.7 GB    28 hours ago
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
- CK: 0.7.1-SNAPSHOT, compilado a partir do repositorio mauricioaniche/ck com o Maven portatil; executado programa a programa por scripts/run_ck.py
- JavaParser: 3.26.2 (usado em AstMetrics.java)
- SonarQube Community 26.11.0.134175, imagem Docker sonarqube:community; sonar-scanner 6.2.1.4610
- Parâmetros de geração: ver OPTIONS em scripts/generate.py (temperature 0.1, seed 42, num_ctx 8192, num_predict 4096)

- Compilacao dos programas gerados: javac --release 11 sob JDK 25

