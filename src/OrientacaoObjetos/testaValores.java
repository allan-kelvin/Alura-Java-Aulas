/*

 */
package OrientacaoObjetos;
/**
 * @author Allan.Kelvin.Santos
 */
public class testaValores {
    public static void main(String[] args) {
        oConta conta = new oConta(2,2);
        
        //Testando o método colocando um valor negativo
        conta.setAgencia(100);
        
        oConta conta2 = new oConta(2,2);
        oConta conta3 = new oConta(3,3);
        oConta conta4 = new oConta(4,5);
        
        System.out.println(oConta.getTotal());
        
    }
    
}
