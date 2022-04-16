/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaPilha;

public class Fluxo_1 {
    
    public static void main(String[] args) {
       
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
        }catch(NullPointerException ex){
            
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
            //try {
                int  a = i/0;
           // } catch (ArithmeticException ex) {
          //  }

        }
        System.out.println("Fim do metodo2");
    }
    
}
