
package JavaUtil_Colletions;

import java.util.ArrayList;
import ByteBank_Herdado.ContaCorrente;
import ByteBank_Herdado.ContaPoupanca;
import ByteBank_Herdado.oConta;
import java.util.ArrayList;

public class ArrayListEquals {
    public static void main(String[] args) {
        //Criando um array list generics
        
        ArrayList<oConta> lista = new ArrayList<>();
        
        oConta cc = new ContaCorrente(222, 444);
        lista.add(cc);

        oConta cp = new ContaPoupanca(232, 222);
        lista.add(cp);
        
        for (oConta conta : lista) {
              System.out.println(conta);
        }
        
        System.out.println(cp.equals(cc));
    }
    
}
