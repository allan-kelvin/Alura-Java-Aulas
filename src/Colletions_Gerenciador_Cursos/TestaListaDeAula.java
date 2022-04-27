
package Colletions_Gerenciador_Cursos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {
    public static void main(String[] args) {
        
        Aula a1 = new Aula("Revistando Arrays", 21);
        Aula a2 = new Aula("Listas de objetos", 20);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 15);
        
        ArrayList<Aula> aulas = new ArrayList<>();
        
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);
        
        System.out.println(aulas);
        
        Collections.sort(aulas);
        
        System.out.println("Depóis de Ordenar");
        System.out.println(aulas); 
        
        
        /* Fazendo esse tipo de comparação, agora ele traz a ordem pelo tempo*/
        /*Usando o SORT   e o Comparator */
        aulas.sort(Comparator.comparing(Aula::getTempo));
        

        
    }
    
}
