/*
 * Testando o Metodo Sacar
 */
package ByteBank_Herdado;

/**
 * @author Allan.Kelvin.Santos
 */
public class TestaSacar {
    public static void main(String[] args) {
        oConta conta = new ContaCorrente(123, 456);
        conta.depositar(300.00);
        try {
            conta.sacar(350.00);
        } catch (SaldoInsuficienteException ex) {
            System.out.println(ex.getMessage());
        }
        
        
        System.out.println("Saldo: "+conta.GetSaldo());
    }
    
}
