
package Colletions_Gerenciador_Cursos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestandoListas {
    public static void main(String[] args) {
        String aula1="Conhecendo mais de listas";
        String aula2="Modelando a classe Aula";
        String aula3="Trabalhando com Cursos e Sets";
        
        ArrayList<String> aulas = new ArrayList<>();
        
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
        aulas.add("Aumentando nosso conhecimento");
        
        System.out.println(aulas);
        
        for (String aula : aulas) {
            System.out.println("Aula: "+aula);
        }
        
        /*SORTE SERVE PARA ORDENAR UMA LISTA*/
        Collections.sort(aulas);
        
        System.out.println("----Depois de Ordenado! ----");
        System.out.println(aulas);
        
        
   
  }
    
}
