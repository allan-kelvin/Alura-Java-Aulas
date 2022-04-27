/**
 * Aprendendo usar SET;
 * 1º Não tem garantia da ordem de inserção
 * 2º Ele nao aceita itens repetidos;
 * 3º Vantagem é velocidade e performance no SET;
 */
package Colletions_Gerenciador_Cursos;

import java.util.HashSet;
import java.util.Set;

public class TestaAluno {
    public static void main(String[] args) {
        Set <String> alunos = new HashSet<>();
        
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Allan Santos");
        alunos.add("Kelvin");
        
        for (String aluno : alunos) {
            System.out.println(aluno);
        }
        
        System.out.println("Tamanho do SET: "+alunos.size());
        
        /*Metodo Contains, traz se contem o elemento especificado dentro do SET*/
        boolean allanEstaMatriculado = alunos.contains("Allan Santos");
        System.out.println(allanEstaMatriculado);
        
    }
    
}
