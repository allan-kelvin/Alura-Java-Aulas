
package OrientacaoObjetos;

public class testeReferencia {
    public static void main(String[] args) {
        
        oConta primeiraConta = new oConta(9,9);
        
        primeiraConta.deposita(100);
        System.out.println("Saldo da Primeira Conta: "+primeiraConta.GetSaldo());
        
        primeiraConta.deposita(200);
        System.out.println("Saldo da Primeira Conta: "+primeiraConta.GetSaldo());
        
        oConta segundoConta=primeiraConta;
        
        segundoConta.depositar(100);
        
         System.out.println("Saldo da Primeira Conta: "+primeiraConta.GetSaldo());
         System.out.println("Saldo da Seunda Conta: "+segundoConta.GetSaldo());
        
        
        
    }
}
