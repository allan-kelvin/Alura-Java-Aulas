
package OrientacaoObjetos;

public class testaMetodo {
    public static void main(String[] args) {
        oConta contaDoPaulo = new oConta(4,4);
        
        contaDoPaulo.deposita(200);
        contaDoPaulo.depositar(50);
        
        System.out.println("Saldo da Conta: "+contaDoPaulo.GetSaldo());
        
        contaDoPaulo.sacar(50);
        System.out.println("Saldo da Conta: "+contaDoPaulo.GetSaldo());
        
        boolean conseguiuRetirar = contaDoPaulo.sacar(50);
        System.out.println("Saldo da Conta : "+contaDoPaulo.GetSaldo());
        System.out.println("Valor do Saque : "+conseguiuRetirar);
        
        //Testando o metod saque, tirando umv valor maior do que esta na conta;
        contaDoPaulo.sacar(60);
        System.out.println("Saldo da Conta: "+contaDoPaulo.GetSaldo());
        
        /*Criando outra conta*/
        
        oConta contaMarcela = new oConta(5,5);
        
        contaMarcela.depositar(1000);
        System.out.println("Saldo da Conta Marcela: "+contaMarcela.GetSaldo());
        
        contaMarcela.transfere(500, contaDoPaulo);
        System.out.println("Saldo da Conta Marcela: "+contaMarcela.GetSaldo());
        System.out.println("Saldo da Conta: "+contaDoPaulo.GetSaldo());
        
        
        // Testando a criação de Cliente referenciando o objeto;
        
        oCliente Allan = new oCliente();
        
        Allan.setNome("Allan kelvin dos Santos");
        Allan.setCpf("3361.181.208.93");
        Allan.setProfissao("Analista de testes");
        
        oConta contaAllan= new oConta(6,6);
        contaAllan.depositar(50);
        
        
    }
}
