📚 Sistema de Gerenciamento de Alunos com Lista Encadeada
Este projeto em Java simula um sistema de gerenciamento de alunos utilizando listas encadeadas ordenadas e não ordenadas. Ele permite a leitura de um arquivo contendo registros de alunos, inserção em listas específicas e busca eficiente por matrícula.

🧩 Funcionalidades
📁 Geração automática de um arquivo com 500 alunos contendo nome, matrícula e nota.

📖 Leitura de registros de alunos a partir de arquivo .txt.

🧮 Armazenamento dos registros em duas listas encadeadas:

Uma ordenada por matrícula.

Uma não ordenada.

🔍 Busca de alunos por matrícula com medição de tempo de execução.

🧪 Comparadores para ordenação por matrícula ou nome.

📂 Estrutura do Projeto
css
Copiar
Editar
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
▶️ Como Executar
Compile os arquivos:

bash
Copiar
Editar
javac Main.java
Execute o programa:

bash
Copiar
Editar
java Main
Escolha uma opção no menu:

1 - Buscar aluno na lista não ordenada

2 - Buscar aluno na lista ordenada

0 - Sair

🛠️ Tecnologias
Java (JDK 8+)

Estrutura de dados: Lista Encadeada

Padrão de projeto com Comparator

👨‍💻 Autores
Projeto desenvolvido como prática de estruturas de dados em Java, com foco em:

Comparação de performance entre listas ordenadas e não ordenadas.

Aplicação de Comparator e orientação a objetos.

Manipulação de arquivos .txt.

📎 Arquivo Gerado
O sistema gera automaticamente um arquivo chamado alunosOrdenados.txt com 500 registros simulados no seguinte formato:

php-template
Copiar
Editar
<matricula>;<nome completo>;<nota>
Exemplo:

python-repl
Copiar
Editar
1;Carlos Souza;8.75
2;Ana Lima;6.40
...
