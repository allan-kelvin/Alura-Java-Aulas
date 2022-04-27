
package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class UsandoScannerMelhor {
    public static void main(String[] args) throws FileNotFoundException {
         Scanner leitura = new Scanner(new File("contas.csv"));
        
        
        while(leitura.hasNextLine()){
            String linha = leitura.nextLine();
            System.out.println(linha);
            
            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(",");
            
            String valor1 = linhaScanner.next();
            int valor2 = linhaScanner.nextInt();
            int valor3 = linhaScanner.nextInt();
            String valor4 = linhaScanner.next();
            double valor5 = linhaScanner.nextDouble();
            
            String.format("%s %s %s %s %s", valor1,valor2,valor3,valor4,valor5);
            //System.out.println(valor1+valor2+valor3+valor4+valor5);
           // System.out.printf("%s %d %d %s %05.2f \n" ,valor1,valor2,valor3,valor4,valor5);
            
            linhaScanner.close();
        }
        
        leitura.close();
     }
  }
 
