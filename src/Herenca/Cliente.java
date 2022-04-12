
package Herenca;
// Quando eu uso interface, a classe que  ira herdar as funções, precisa usar a palavra reservada HERDAR;
public class Cliente implements Autenticavel {
    
     private AutenticacaoUtil autenticador;
     
     public Cliente(){
        this.autenticador= new AutenticacaoUtil();
    }
    
    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
     return this.autenticador.autentica(senha);
    }
    
}
