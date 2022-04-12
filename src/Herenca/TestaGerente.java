
package Herenca;

public class TestaGerente {
    public static void main(String[] args) {
        oGerente G1 = new oGerente();
        
        G1.setNome("Robson");
        G1.setCpf("24587465896");
        G1.setSalario(8000.00);
        
        System.out.println("Nome: "+G1.getNome());
        System.out.println("CPF: "+G1.getCpf());
        System.out.println("Salário: "+G1.getSalario());
        
        G1.setSalario(2222);
        
        System.out.println(G1.autentica(2222));
    }
    
}
