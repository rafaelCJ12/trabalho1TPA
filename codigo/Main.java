//import java.util.Comparator;

class Main{
    public static void main(String[] args) {
        ListaEncadeadaComComparator<Aluno> lista = new ListaEncadeadaComComparator<>(true, new ComparadorAlunoPorNome());
        ListaEncadeadaComComparator<Aluno> lista2 = new ListaEncadeadaComComparator<>(false, new ComparadorAlunoPorNome());
        
        GeradorArquivosOrdenados gerador = new GeradorArquivosOrdenados();

        LeitorArquivos leitor = new LeitorArquivos();

        leitor.leArquivo(lista);
        leitor.leArquivo(lista2);

        System.out.println(lista);

        System.out.println(lista2);
        

    }
}