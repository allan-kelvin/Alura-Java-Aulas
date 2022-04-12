/*
 * 
 */
package OrientacaoObjetos;

public class bytebank {
    public static void main(String[] args) {
        oConta Conta1 = new oConta(1,1);
        
        Conta1.deposita(100);
        System.out.println(Conta1.GetSaldo());
        
        
    }
    
}
