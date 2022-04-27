
package Colletions_Gerenciador_Cursos;

public class Aluno {
    
    private String nome;
    private int numeroMatricula;
    

    public Aluno(String nome, int numeroMatricula) {
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    @Override
    public String toString() {
        return "{" + "nome=" + nome + ", numeroMatricula=" + numeroMatricula + '}';
    }
    
    
    
}
