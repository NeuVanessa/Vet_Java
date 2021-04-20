
package br.com.Model;

    public class Cliente extends Administrador{ 
    private int Id_Dono;
    private String Nome_Animal ;
    private int Idade_Animal ;   
    private String Raça_Animal;
    private String Porte_Animal ;
    private String Sexo_Animal ;

    public Cliente(int Id_Funcionario, String Nome_Completo, String Endereco, String Telefone, String Login_User, String Senha_User) {
        super(Id_Funcionario, Nome_Completo, Endereco, Telefone, Login_User, Senha_User);
        this.Id_Dono = Id_Dono;
        this.Idade_Animal = Idade_Animal;
        this.Porte_Animal = Porte_Animal;
        this.Sexo_Animal = Sexo_Animal;
        this.Raça_Animal = Raça_Animal;
        
        
    }



}
