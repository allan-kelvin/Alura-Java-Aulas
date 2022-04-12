
package ByteBank_Herdado;

public class TestesContas {
    public static void main(String[] args) {
        
        ContaCorrente cc = new ContaCorrente(111,111);
        cc.depositar(100.0);
        System.out.println("Saldo Conta: "+cc.GetSaldo());
        
        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.depositar(200.0);
        
        cc.transfere(10.0, cp);
        
        System.out.println("Saldo Conta CC: "+cc.GetSaldo());
        System.out.println("Saldo Conta CC: "+cp.GetSaldo());
        
        
        //Testando o sacar, quando eu saco e tiro 0,20 centavos
        cc.sacar(20.0);
        System.out.println("Saldo Conta CC: "+cc.GetSaldo());
        
       
        
    }
}
