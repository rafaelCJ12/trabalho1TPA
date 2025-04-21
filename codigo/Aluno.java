//import java.util.Comparator;

class Aluno {
    private String nome;
    private int matricula;
    private double nota;


    Aluno(int m, String n, float nt) {
        this.nome = n;
        this.matricula = m;
        this.nota = nt;
    }

    
    public String toString() {
        return  "\nMATRICULA: " + Integer.toString(this.matricula)+ " | NOME: " + this.nome + " | NOTA: " + Double.toString(this.nota)+"\n";
    }
    

    String getNome() {
        return this.nome;
    }

    int getMatricula() {
        return this.matricula;
    }

    void setMatricula(int m) {
        this.matricula = m;
    }
}