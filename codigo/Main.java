//import java.util.Comparator;

class Main{
    public static void main(String[] args) {
        ListaEncadeadaComComparator<Aluno> listaOrdNome = new ListaEncadeadaComComparator<Aluno>(true, new ComparadorAlunoPorNome());

        ListaEncadeadaComComparator<Aluno> listaOrdMatricula = new ListaEncadeadaComComparator<Aluno>(true, new ComparadorAlunoPorMatricula());

        Aluno a1 = new Aluno(1, "Ze", 50);

        Aluno a2 = new Aluno(2, "Mane", 50);

        Aluno a3 = new Aluno(3, "Pedro", 0);

        listaOrdNome.inserirElemento(a1);
        listaOrdNome.inserirElemento(a2);   
        listaOrdNome.inserirElemento(a3);

        listaOrdMatricula.inserirElemento(a3);
        listaOrdMatricula.inserirElemento(a2);
        listaOrdMatricula.inserirElemento(a1);
    

        System.out.println("Lista ordenada por nome: " + listaOrdNome);
        System.out.println("lista ordenada por matricula: " + listaOrdMatricula);

    }
}