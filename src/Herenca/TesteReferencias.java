
package Herenca;

public class TesteReferencias {
    public static void main(String[] args) {
        
        //Instancia normal, Gerente
        
        oGerente g1 = new oGerente();
        g1.setNome("Allan");
        g1.setSalario(5000.00);
        System.out.println("Nome>: "+g1.getNome());
        
    
         //Instanciando o Funcionario Editor de Videos
         oEditorVideo ev = new oEditorVideo();
         ev.setSalario(2500);
        
        //Usando o controle de Bonificacao
        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(ev);
        
        //Exibindo Resultado da soma
        System.out.println("A soma: "+controle.getSoma());

       
    }
    
}
