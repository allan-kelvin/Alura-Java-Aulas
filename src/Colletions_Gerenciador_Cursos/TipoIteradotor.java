/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colletions_Gerenciador_Cursos;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Allan.Kelvin.Santos
 */
public class TipoIteradotor {
    
public static void main(String[] args) {

        List<String> letras = new LinkedList<>();
        letras.add("A");
        letras.add("B");
        letras.add("C");
        
        Iterator<String> iterador =letras.iterator();
        
        while(iterador.hasNext()){
            System.out.println(iterador.next());
        }
    
    }
} 
