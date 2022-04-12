/*
 *Objeto Conta
 */
package OrientacaoObjetos;

public class oConta {
    
    private double saldo;
    private int agencia;
    private int numero;
    private oCliente titular;
    private static int total;
    
    public oConta(int agencia, int numero){
        oConta.total++;
        System.out.println("Conta Criada com Sucesso, você é o nosso Cliente: "+oConta.total);
        this.agencia=agencia;
        this.numero=numero;
    }

    void depositar( double valorDeposito){
       this.saldo +=valorDeposito;
    }
    
   public boolean sacar(double valorSaque ){
        if (this.saldo >= valorSaque){
            this.saldo -=valorSaque;
            System.out.println("Saque Efetuado com Sucesso!!");
            return true;    
        }else {
            System.out.println("Saque não Efetuado, Saldo Insuficiente!!");
            return false;          
        }
    }
   
   public boolean transfere(double valorTransferencia, oConta contaDestino ){
       if(this.saldo >=valorTransferencia){
           this.saldo -=valorTransferencia;
           contaDestino.depositar(valorTransferencia);
           System.out.println("Transferencia Realizada com Sucesso !!");
           return true;
       }else{
           System.out.println("Transferencia não  Realizada, saldo Insuficiente !!");
           return false;
       }
   } 
    public void deposita(double valor){
        
    }
    
   public double GetSaldo (){
       return this.saldo;
   }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <=0){
            System.out.println("O numero da Agencia não pode ser Negativo");
            return;
        }
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if(numero <= 0){
            System.out.println("O numero da Conta nao pode ser Menor que zero");
        }
        this.numero = numero;
    }

    public oCliente getTitular() {
        return titular;
    }

    public void setTitular(oCliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        System.out.println("O total de Contas Criadas é:");
        return oConta.total;
    }
   
   
}
