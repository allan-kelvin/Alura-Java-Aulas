
package br.com.alura.java.io.teste;

import java.io.FileWriter;
import java.io.IOException;


public class NovaEscrita {
    public static void main(String[] args) throws IOException{
        
       // OutputStream fos = new FileOutputStream("C:\\Users\\Allan Kelvin Santos\\Documents\\lorem2.txt");
       // Writer osw =new OutputStreamWriter(fos);
       // BufferedWriter bw = new BufferedWriter(osw);
        FileWriter fw = new FileWriter("arquivo.txt");
        fw.write("AALLAN KELVI DOS SANTOS"); 
        //fw.write("\n");
        fw.write(System.lineSeparator()); // serve para pular a linha;
        fw.write("Aaa lo");
        fw.close();
    }
}
