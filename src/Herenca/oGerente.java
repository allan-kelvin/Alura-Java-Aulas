/*
 * Gerente Herdando do Funcionario
 */
package Herenca;

//Classe Gerente é um funcionario e é um autenticavel.
public class oGerente extends oFuncionario implements Autenticavel{
    private int senha;

    public double getBonificacao(){
      return super.getSalario();   
    }

    @Override
    public void setSenha(int senha) {
        this.senha=senha;
    }

    @Override
    public boolean autentica(int senha) {
         if (this.senha ==senha){
            return true;
        }else {
            return false;
        }
    }

}