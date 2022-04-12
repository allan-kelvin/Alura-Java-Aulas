
package TipoEnum;

public class TesteEnum {
    public static void main(String[] args) {
        ExemploEnum pMin = ExemploEnum.MIN;
        ExemploEnum pMax = ExemploEnum.MAX;
        
        //ORDENAL, TRAZ EM QUAL SEGUENCIA ESTA
        System.out.println(pMin.ordinal());
        System.out.println(pMax.ordinal());
        
        
        System.out.println(pMin.getValor());
        System.out.println(pMax.getValor());
    }
    
}
