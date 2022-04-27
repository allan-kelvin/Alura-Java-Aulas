/**
 * Nessa Classe aprendemos de forma mais manual e passo a passo como utilizar as classes
 * FileInputStream, InputStreamReader,BufferedReader. Para leitura de arquivos dentro do java.
 */

package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {
    public static void main(String[] args) throws IOException {
        
        //Fluxo de Entrada
        
        FileInputStream fis = new FileInputStream("lorem.txt");
        InputStreamReader isr =new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        
        /*Se quiser imprimir o arquivo inteiro Usa o While para ele Ler enquanto tiver informações dentro do arquivo*/
        String linha =  br.readLine();
        /*Usamos o while para fiar lendo ate nao tiver nada dentro, ou seja NULL*/
        /*Se quiser ler apenas uma linha do arquivo, basta tirar o while  e o readLine*/
        while(linha!=null){ //Tirar o While
           System.out.println(linha);
           linha=br.readLine();// tirar o readline
        }

        br.close();
    }
    
}
