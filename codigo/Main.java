//import java.util.Comparator;

class Main{
    public static void main(String[] args) {
        ListaEncadeadaComComparator<Aluno> lista = new ListaEncadeadaComComparator<>(true, new ComparadorAlunoPorNome());
        ListaEncadeadaComComparator<Aluno> lista2 = new ListaEncadeadaComComparator<>(false, new ComparadorAlunoPorNome());
        
        GeradorArquivosOrdenados g = new GeradorArquivosOrdenados();

        LeitorArquivos l = new LeitorArquivos(lista);
        LeitorArquivos l2 = new LeitorArquivos(lista2);

        System.out.println(lista);

        System.out.println(lista2);
        

    }
}