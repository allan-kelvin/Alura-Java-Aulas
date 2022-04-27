
package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteCopiarArquivo {
    public static void main(String[] args) throws IOException {
        
        
        
        InputStream fis = System.in;
        InputStreamReader isr =new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        
        OutputStream fos = new FileOutputStream("lorem2.txt");
        Writer osw =new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String linha =  br.readLine();
        
        while(linha!=null && linha.isEmpty()){ //isEmply, serve para identicar, se tambem nao esta vazio.
           bw.write(linha);
           linha=br.readLine();
        }

        br.close();
        bw.close();
    }
    
}
