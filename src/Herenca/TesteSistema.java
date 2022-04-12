
package Herenca;

public class TesteSistema {
    public static void main(String[] args) {
        
        oGerente g= new oGerente();
        g.setSenha(2222);
        
        Administrador adm = new Administrador();
        adm.setSenha(2222);
        
        Cliente cliente = new Cliente();
        cliente.setSenha(2222);
        
        SistemaInterno sistema = new SistemaInterno();
        sistema.autentica(g);
        sistema.autentica(adm);
        sistema.autentica(cliente);
        
        
    }
    
}
