
package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;


public class LendoArquivos {
    public static void main(String[] args) throws IOException {
        
        InputStream leitor = new FileInputStream("lorem.txt");
        Reader arquivoTransformado = new InputStreamReader(leitor);
        BufferedReader arquivoFinal = new BufferedReader(arquivoTransformado);
        
        String linha =  arquivoFinal.readLine();
        
        while(linha !=null){
            System.out.println(linha);
            linha=arquivoFinal.readLine();
        }
    }
    
}
