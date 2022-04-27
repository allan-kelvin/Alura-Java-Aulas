/**
 * Este tipo de lista possui melhor performance nos métodos add e remove, do que os métodos add e remove do ArrayList, em compensação seus métodos get e set possuem uma performance pior do que os do ArrayList.
 */
package JavaUtil_Colletions;

import ByteBank_Herdado.ContaCorrente;
import ByteBank_Herdado.ContaPoupanca;
import ByteBank_Herdado.oConta;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListmodelo1 {
    public static void main(String[] args) {
        List<oConta> lista = new LinkedList<oConta>();
        
        oConta cc = new ContaCorrente(222, 444);
        lista.add(cc);

        oConta cp = new ContaPoupanca(232, 222);
        lista.add(cp);
    }
    
}
