
package Herenca;
// Contrato Autenticavel
  // quem assinar esse contrato, precisa implentar
     //metodo senha
      // metodo autentica
   
public abstract interface Autenticavel{
    

    public abstract void setSenha(int senha);
    
    public abstract boolean autentica(int senha);
 
    
}
