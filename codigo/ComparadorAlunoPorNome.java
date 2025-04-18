import java.util.Comparator;

class ComparadorAlunoPorNome implements Comparator<Aluno>{
    public int compare(Aluno a1, Aluno a2) {
        return a1.getNome().compareTo(a2.getNome());
    }

}