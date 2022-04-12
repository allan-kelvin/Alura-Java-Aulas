
package ByteBank_Herdado;

public class ContaPoupanca extends oConta{
    
    public ContaPoupanca(int agencia, int numero){
        super(agencia,numero);
    }

    @Override
    public void depositar(double valorDeposito) {
        super.saldo+=valorDeposito;
    }
}
