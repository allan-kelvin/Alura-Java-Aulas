
package br.com.alura.java.io.teste;
/*USANDO split na classe*/
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Allan.Kelvin.Santos
 */
public class UsandoScannerCompleto {
    public static void main(String[] args) throws  Exception {
        
         Scanner leitura = new Scanner(new File("contas.csv"));
        
        
        while(leitura.hasNextLine()){
            String linha = leitura.nextLine();
            System.out.println(linha);
            
            /*Aqui criamos o Array 'valores', e colocamos separadamente cada valor*/
            String[] valores = linha.split(",");
            System.out.println(Arrays.toString(valores));
        }
        
        leitura.close();
     }
}
    
