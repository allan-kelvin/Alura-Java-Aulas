
package JavaUtil_Colletions;

import ByteBank_Herdado.ContaCorrente;
import ByteBank_Herdado.ContaPoupanca;
import ByteBank_Herdado.oConta;
import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        
        ArrayList<oConta> lista = new ArrayList<>();
        
        oConta cc= new ContaCorrente(111,222);
        lista.add(cc);
        
        oConta cp = new ContaPoupanca(111,333);
        lista.add(cp);
        
        System.out.println("Tamanho do meu ArrayLis:"+lista.size());
        
        
        
    }
}
