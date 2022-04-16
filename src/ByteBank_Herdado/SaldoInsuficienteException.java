
package ByteBank_Herdado;

public class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException(String msg){
        super(msg);
    }
}
