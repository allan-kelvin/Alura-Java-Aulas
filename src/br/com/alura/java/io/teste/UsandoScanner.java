
package br.com.alura.java.io.teste;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Allan.Kelvin.Santos
 */
public class UsandoScanner {
    
    public static void main(String[] args) throws  Exception{
        Scanner leitura = new Scanner(new File("contas.csv"));
        
        // O HASNEXTLINE, PROCURA SE TEM PROXIMA LINHA, E COM O LAÇO WHILE, ELE TRAZ.
        while(leitura.hasNextLine()){
            String linha = leitura.nextLine();
            System.out.println(linha);
        }
        leitura.close();
    }
    
}
