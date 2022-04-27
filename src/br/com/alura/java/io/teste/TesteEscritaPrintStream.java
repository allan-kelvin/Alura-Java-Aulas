/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintStream;

/**
 *
 * @author Allan.Kelvin.Santos
 */
public class TesteEscritaPrintStream {
    public static void main(String[] args) throws IOException {
        
        PrintStream ps = new PrintStream("Lorem4.txt");
        
        ps.println("Allan");
        ps.println();
        ps.println("Santos");

        ps.close();

    }
    
}
