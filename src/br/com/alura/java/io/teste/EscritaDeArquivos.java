
package br.com.alura.java.io.teste;


import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class EscritaDeArquivos {
    public static void main(String[] args) throws IOException{
        
        OutputStream fos = new FileOutputStream("C:\\Users\\Allan Kelvin Santos\\Documents\\lorem2.txt");
        Writer osw =new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);
        
        bw.write("Allan Kelvin dos Santos");
        bw.newLine();
        bw.write("Fim");
        bw.close();
    }
}
