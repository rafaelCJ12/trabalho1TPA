# 📚 Sistema de Gerenciamento de Alunos com Lista Encadeada
Este projeto em Java simula um sistema de gerenciamento de alunos utilizando listas encadeadas ordenadas e não ordenadas. Ele permite a leitura de um arquivo contendo registros de alunos, inserção em listas específicas e busca eficiente por matrícula.

## 🧩 Funcionalidades
- 📄 Geração automática de um arquivo com alunos contendo nome, matrícula e nota.
- 📖 Leitura de registros de alunos a partir de arquivo .txt.
- 💾 Armazenamento dos registros em duas listas encadeadas:
  - Uma ordenada por matrícula.
  - Uma não ordenada.
- 🔍 Busca de alunos por matrícula com medição de tempo de execução.
- 🧪 Comparadores para ordenação por matrícula ou nome.

## 📂 Estrutura do Projeto
```css
├── Aluno.java
├── ComparadorAlunoPorMatricula.java
├── ComparadorAlunoPorNome.java
├── Entrada.java
├── GeradorArquivosOrdenados.java
├── LeitorArquivos.java
├── Main.java
└── bibliotecaLista
    ├── ListaEncadeadaComComparator.java
    └── No.java
```

## 🛠 Tecnologias Utilizadas
- **Java (JDK 8+)** (linguagem de programação)
- **JVM**
- Estrutura de dados: Lista Encadeada

## ▶️ Como Executar o Programa
### 1️⃣ Compilar o código (exemplo)
```bash
javac Main.java
```

### 2️⃣ Executar o programa (exemplo)
```bash
java Main
```
### 2️⃣ Executar o programa (exemplo)
- 1 - Buscar aluno na lista não ordenada
- 2 - Buscar aluno na lista ordenada
- 0 - Sair

## 📝 Caraterísticas do projeto
Projeto desenvolvido como prática de estruturas de dados em Java, com foco em:
- Comparação de performance entre listas ordenadas e não ordenadas.
- Aplicação de Comparator e orientação a objetos.
- Manipulação de arquivos .txt.

## 📎 Arquivo Gerado
O sistema gera automaticamente um arquivo chamado alunosOrdenados.txt com registros simulados no seguinte formato:
```bash
<matricula>;<nome completo>;<nota>
```
Exemplo:
```bash
1;Carlos Souza;8.75
2;Ana Lima;6.40
...
```

---

