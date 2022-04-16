/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaPilha;

public class FluxoComTratamento {
    
    public static void main(String[] args) {
       
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (ArithmeticException | NullPointerException ex) {
            String msg =ex.getMessage();
            System.out.println("Exception"+msg);
            ex.printStackTrace();
        }
        
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
           //ArithmeticException  execption=new ArithmeticException(" Deu erro");
           //throw execption;
          // throw new ArithmeticException("DEU ERRO");
           throw new MinhaExecao("Deu muitooooooo Errado");
        }
        System.out.println("Fim do metodo2");
    }
    
}
