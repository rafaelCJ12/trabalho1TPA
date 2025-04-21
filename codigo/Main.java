import bibliotecaLista.ListaEncadeadaComComparator;

public class Main{

    //metodo que faz a busca na lista
    private static void buscaLista(ListaEncadeadaComComparator lista, Entrada e, Aluno a) {
        int matricula = -1;
        double inicio = 0;

        try {
            //tenta ler uma matricula
            matricula = e.lerInteiro("Digite a matricula do aluno a ser pesquisado: ");

            //se o aluno apontar para null entao deve-se criar uma nova instancia da classe aluno com a matricula recebida
            if(a == null) {
                a = new Aluno(matricula, "", 0); 
            }

            //se o aluno nao apontar para null, deve-se somente alterar a matricula da instancia ja criada
            else{
                a.setMatricula(matricula); //altera a matricula do objeto aluno para o novo aluno
                
            }

            inicio = System.nanoTime();
            a = (Aluno) lista.pesquisar(a); //retorna um objeto da classe Aluno
            inicio =  (System.nanoTime() - inicio) / 1000000;

            //se um aluno foi encontrado entao ele nao eh um objeto que aponta para null
            if(a != null) {
                System.out.println("Aluno encontrado: " + a);
            }
            
            else{
                System.out.println("Aluno nao encontrado.");
            }

            if(lista.getEhOrdenada()) {
                System.out.println("Tempo da busca na lista ordenada: " + inicio + " ms.");
            }

            else{
                System.out.println("Tempo da busca na lista nao ordenada: " + inicio + " ms.");
            }
        } 
        
        catch (NumberFormatException ex) {
            System.out.println("Formato de matricula invalido!");
        }
        
    }

  
    public static void main(String[] args) {
        Entrada entrada = new Entrada();
        int opcao = -1;
        ListaEncadeadaComComparator<Aluno> listaOrd = new ListaEncadeadaComComparator<Aluno>(true, new ComparadorAlunoPorMatricula());
        ListaEncadeadaComComparator<Aluno> listaNaoOrd = new ListaEncadeadaComComparator<Aluno>(false, new ComparadorAlunoPorMatricula());
        GeradorArquivosOrdenados gerador = new GeradorArquivosOrdenados();
        double inicio = 0;
        LeitorArquivos leitor = new LeitorArquivos();
        Aluno a = new Aluno(0, "", 0);

        inicio = System.nanoTime();
        leitor.leArquivo(listaOrd);
        System.out.println("Tempo para criar a lista ordenada: " + ((System.nanoTime() - inicio) / 1000000) + " ms.");
        
        inicio = System.nanoTime();
        leitor.leArquivo(listaNaoOrd);
        System.out.println("Tempo para criar a lista nao ordenada: " + ((System.nanoTime() - inicio) / 1000000) + " ms.");

        while(opcao != 0) {
            try{
                System.out.println("\nOla! Escolha uma opcao:");
                System.out.println("\n1) Pesquisar aluno na lista nao ordenada.");
                System.out.println("2) Pesquisar aluno na lista ordenada.");
                System.out.println(("0) Sair."));

                opcao = entrada.lerInteiro("Digite a opcao desejada: ");

                switch (opcao) {
                    case 1:
                        buscaLista(listaNaoOrd, entrada, a);
                        break;
                    case 2:
                        buscaLista(listaOrd, entrada, a);
                        break;
                    case 0:
                        System.out.println("Adeus!");
                        break;
                
                    default:
                        System.out.println("Opcao invalida!");
                        break;
                }

            }

            catch(NumberFormatException e) {
                System.out.println("Entrada invalida!");
            }

        }
        
    }
}