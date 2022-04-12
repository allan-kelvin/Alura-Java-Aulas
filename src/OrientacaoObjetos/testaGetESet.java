/*
 */
package OrientacaoObjetos;

/**
 * @author Allan.Kelvin.Santos
 */
public class testaGetESet {
    public static void main(String[] args) {
        
        oConta conta = new oConta(3,3);
        
        conta.setNumero(1337);
        System.out.println("Numero da Conta: "+conta.getNumero());
        
        oCliente allan = new oCliente();    
        conta.setTitular(allan);
        allan.setNome("Allan Kelvin");
        
        conta.setTitular(allan);
        
        System.out.println("Nome do titular da conta: "+conta.getTitular().getNome());
    }
    
}
