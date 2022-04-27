
package JavaUtil_Colletions;

import ByteBank_Herdado.ContaCorrente;
import ByteBank_Herdado.ContaPoupanca;
import ByteBank_Herdado.oConta;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenarLista {
     public static void main(String[] args) {

                oConta cc1 = new ContaCorrente(22, 33);
                cc1.depositar(333.0);

                oConta cc2 = new ContaPoupanca(22, 44);
                cc2.depositar(444.0);

                oConta cc3 = new ContaCorrente(22, 11);
                cc3.depositar(111.0);

                oConta cc4 = new ContaPoupanca(22, 22);
                cc4.depositar(222.0);

                List<oConta> lista = new ArrayList<>();
                lista.add(cc1);
                lista.add(cc2);
                lista.add(cc3);
                lista.add(cc4);
                
                NumeroDaContaComparator comparador = new NumeroDaContaComparator();
                lista.sort(comparador);
               
                for (oConta conta : lista) {
                    System.out.println(conta);
                     System.err.println("-----------------");
         }
    }
     
}


class NumeroDaContaComparator implements Comparator<oConta>{

    @Override
    public int compare(oConta c1, oConta c2) {
        if(c1.getNumero() <c2.getNumero()){
        return -345;
    } 
        if(c1.getNumero() >c2.getNumero()){
        return 1;
    }      
        return 0;
 }
}
    