//import java.util.Comparator;

class Aluno {
    private String nome;
    private int matricula;
    private int nota;


    Aluno(int m, String n, int nt) {
        this.nome = n;
        this.matricula = m;
        this.nota = nt;
    }

    
    public String toString() {
        return "\nNOME: " + this.nome + "\nMATRICULA: " + Integer.toString(this.matricula)+ "\nNOTA: " + Integer.toString(this.nota)+"\n";
    }
    

    String getNome() {
        return this.nome;
    }

    int getMatricula() {
        return this.matricula;
    }
}