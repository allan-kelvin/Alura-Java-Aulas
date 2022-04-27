
package JavaUtil_Colletions;

/**
 *
 * @author Allan.Kelvin.Santos
 */
public class ArrayBasico {
    public static void main(String[] args) {
           //Criando um Array de baixo Nivel.
        int[] arrays = new int[5];
        
        //ADICIONANDO VALORES NO ARRAY DE MANEIRA MANUAL;
        
        /*
        arrays[0]=1;
        arrays[1]=2;
        arrays[2]=3;
        arrays[3]=4;
        arrays[4]=5;
        
        System.out.println(arrays[0]);

        */
        
        /*adicionando e Imprimindo o Arrays de maneira mais agil*/
        for(int i =0; i< arrays.length; i++){
            arrays[i] =i;
        }

        for(int i =0; i< arrays.length; i++){
            System.out.println(arrays[i]);
        }
        
    }
    
}
