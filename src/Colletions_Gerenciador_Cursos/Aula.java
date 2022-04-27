
package Colletions_Gerenciador_Cursos;


public class Aula  implements Comparable<Aula>{
    private String titulo;
    private int tempo;
    
    public Aula(String titulo, int tempo){
        this.titulo = titulo;
        this.tempo= tempo;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
     public int getTempo() {
        return tempo;
    }

    @Override
    public String toString() {
        return "[Aula: " + this.titulo + ", " + this.tempo + " minutos]";
    }
    /*O COMPARETO PRECISA FAER ESSA COMPARACAO, POR CONTA QUE O METODO NAO SABE COMO COMPARAR*/
    @Override
    public int compareTo(Aula outraAula) {
        return this.titulo.compareTo(outraAula.titulo);
    }
     
    
}
