
package ByteBank_Herdado;

public class testeTributaveis {
    public static void main(String[] args) {
        ContaCorrente cc= new ContaCorrente(222,222);
        cc.depositar(100.0);
        SeguroDeVida seguroBasico = new SeguroDeVida();
        
        CalcularImposto calc = new CalcularImposto();
        calc.registra(cc);
        calc.registra(seguroBasico);
        
        System.out.println("Total: "+calc.getTotalImposto());
    }
}
