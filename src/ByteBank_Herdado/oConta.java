/*
 *Objeto Conta
 */
package ByteBank_Herdado;

// Deixar as classes abstratas significa que nao podemos mais instanciar esse objeto:
// Uma classe pode ter, construtor, Atriburos e metodos;
public abstract class oConta {
    
    protected double saldo;
    private int agencia;
    private int numero;
    private oCliente titular;
    private static int total=0;
    
    public oConta(int agencia, int numero){
        oConta.total++;
        System.out.println("Conta Criada com Sucesso, você é o nosso Cliente: "+oConta.total);
        this.agencia=agencia;
        this.numero=numero;
    }

   public abstract void depositar( double valorDeposito);

   public void sacar(double valorSaque ){
        if (this.saldo >= valorSaque){
            this.saldo -=valorSaque;
            System.out.println("Saque Efetuado com Sucesso!!");    
        } else {
            throw new SaldoInsuficienteException(("Saldo: "+ this.saldo+", Valor: "+ valorSaque));
        }
   }
   public boolean transfere(double valorTransferencia, oConta contaDestino){
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
   
   /*OUTRA MANEIRA DE FAZER O METODO TRANSFERE*/
   // public void transferencia(double valorTransferencia, oConta destino){
     //   this.sacar(valorTransferencia);
       // destino.depositar(valorTransferencia);
   // }
    
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

    @Override
    public String toString() {
        return ("saldo=" + saldo + ", agencia=" + agencia + ", numero=" + numero + ", titular=" + titular);
    }
   
    
   
}
