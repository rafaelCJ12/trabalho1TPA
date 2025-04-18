import java.util.Comparator;

class ComparadorAlunoPorMatricula implements Comparator<Aluno>{
    public int compare(Aluno a1, Aluno a2) {
        return Integer.compare(a1.getMatricula(), a2.getMatricula());
    }
}