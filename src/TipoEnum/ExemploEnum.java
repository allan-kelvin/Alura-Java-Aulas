
package TipoEnum;

public enum ExemploEnum {
    
    MIN(1),NORMAL(5),MAX(10);
    private int valor;
    
    private ExemploEnum(int valor) {
        this.valor=valor;
    }
    
    public int getValor(){
        return this.valor;
    }
    
}
