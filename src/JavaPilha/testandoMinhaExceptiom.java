
package JavaPilha;

public class testandoMinhaExceptiom {
    public static void main(String[] args) {
        
        metodo();
       
    }
     private static void metodo() throws MinhaException{
         System.out.println("Deu tudo certo");
         throw new MinhaException("Deu Errado tente Novamente");
     }
}
