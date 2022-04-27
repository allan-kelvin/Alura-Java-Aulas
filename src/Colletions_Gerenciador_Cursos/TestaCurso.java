
package Colletions_Gerenciador_Cursos;

import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {
        
        Curso JavaColletions = new Curso("Dominando as coleções do Java","Paulo Silveira" );
        
        List<Aula> aulas = JavaColletions.getAulas();
        System.out.println(aulas);
        
       // JavaColletions.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
        JavaColletions.adiciona(new Aula("Trabalhando com ArrayList", 21));
        JavaColletions.adiciona(new Aula("Criando Aula", 20));
        JavaColletions.adiciona(new Aula("Modelando com colecoes", 24));

        System.out.println(aulas);
    }
    
}
