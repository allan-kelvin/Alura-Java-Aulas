
package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class testeEscritaWriter {

        public static void main(String[] args) throws IOException {

        //Fluxo de Entrada com Arquivo
        //OutputStream fos = new FileOutputStream("lorem2.txt");
        //Writer osw = new OutputStreamWriter(fos);
        //Buff3eredWriter bw = new BufferedWriter(osw);

        //BufferedWriter bw = new BufferedWriter( new FileWriter("lorem2.txt"));
        
        /*FILE WRITER SERVE PARA ESCREVER OS ARQUIVOS*/
        FileWriter fw = new FileWriter("Lorem3.txt");
        /*USANDO O BUFFERDWRITER PODE TER MAIS FERRAMENTAS*/
        
        
        
        
        BufferedWriter bw = new BufferedWriter(new FileWriter("Lorem.txt"));// Aqui ja estamos instanciando o FileWriter dentro do BufferedWriter

        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        bw.write("Teste teste teste");
        bw.newLine();
        bw.write("asfasdfsafdas dfs sdf asf assdß");

        bw.close();

        }
    
}
