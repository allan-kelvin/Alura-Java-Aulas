/*

 */
package OrientacaoObjetos;

/**
 * @author Allan.Kelvin.Santos
 */
public class testaValoresNegativos {
    public static void main(String[] args) {
        oConta conta = new oConta(7,7);
        
        //Testando o Depositar 
        conta.depositar(100);
        
        //Testando o Sacar com valor maior que o deposito em conta.
        System.out.println(conta.sacar(200)); 
        
        System.out.println("Saldo: "+conta.GetSaldo());
        
 
       
    }
    
}
