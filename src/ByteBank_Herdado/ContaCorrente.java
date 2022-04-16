
package ByteBank_Herdado;

public class ContaCorrente extends oConta implements Tributavel{
    
    public ContaCorrente(int agencia, int numero){
        super(agencia, numero);
    }

    @Override
    public void sacar(double valorSaque) {
        double valorASacaar = valorSaque +0.2;
        super.sacar(valorASacaar);
    }

    @Override
    public void depositar(double valorDeposito) {
        if(valorDeposito>10){
           System.out.println("O Deposito no valor de "+valorDeposito+", foi efetuado com Sucesso! ");
        super.saldo+=valorDeposito; 
        }else{
            System.out.println("O Deposito Minimo é no valor de $10,00");
        }
        
    }

    @Override
    public double getValorImposto() {
        return super.saldo *0.01;
    }
    
    
}
