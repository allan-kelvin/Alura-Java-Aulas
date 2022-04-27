
package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class NovaEscritaAltoNivel {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("arquivo2.txt"));
        
        bw.write("Arquivo texto");
        bw.newLine();
        bw.newLine();//Serve para pular linha;
        
        bw.write("Fim");
        
        bw.close();
        
    }
    
}
