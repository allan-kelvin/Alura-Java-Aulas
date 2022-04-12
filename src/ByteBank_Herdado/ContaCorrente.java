
package ByteBank_Herdado;

public class ContaCorrente extends oConta implements Tributavel{
    
    public ContaCorrente(int agencia, int numero){
        super(agencia, numero);
    }

    @Override
    public boolean sacar(double valorSaque) {
        double valorASacaar = valorSaque +0.2;
        return super.sacar(valorASacaar); 
    }

    @Override
    public void depositar(double valorDeposito) {
        super.saldo+=valorDeposito;
    }

    @Override
    public double getValorImposto() {
        return super.saldo *0.01;
    }
    
    
}
