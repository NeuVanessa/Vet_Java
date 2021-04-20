
package br.com.Model;


    public class Administrador {
    private int Id_Admin ;
    private String Nome_Completo ;
    private String Endereco;
    private String Telefone ;
    private String Usuario_Admin;
    private String Senha_Admin;


    public Administrador(int Id_Admin, String Nome_Completo,String Endereco, String Telefone, String Login_User , String Senha_User){
    
    this.Id_Admin = Id_Admin;
    this.Nome_Completo =  Nome_Completo;
    this.Endereco = Endereco;
    this.Telefone = Telefone;
    this.Usuario_Admin = Login_User;
    this.Senha_Admin =  Senha_User;
    
    
}

    /**
     * @return the Id_Admin
     */
    public int getId_Admin() {
        return Id_Admin;
    }

    /**
     * @param Id_Admin the Id_Admin to set
     */
    public void setId_Admin(int Id_Admin) {
        this.Id_Admin = Id_Admin;
    }

    /**
     * @return the Nome_Completo
     */
    public String getNome_Completo() {
        return Nome_Completo;
    }

    /**
     * @param Nome_Completo the Nome_Completo to set
     */
    public void setNome_Completo(String Nome_Completo) {
        this.Nome_Completo = Nome_Completo;
    }

    /**
     * @return the Endereco
     */
    public String getEndereco() {
        return Endereco;
    }

    /**
     * @param Endereco the Endereco to set
     */
    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    /**
     * @return the Telefone
     */
    public String getTelefone() {
        return Telefone;
    }

    /**
     * @param Telefone the Telefone to set
     */
    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    /**
     * @return the Usuario_Admin
     */
    public String getUsuario_Admin() {
        return Usuario_Admin;
    }

    /**
     * @param Usuario_Admin the Usuario_Admin to set
     */
    public void setUsuario_Admin(String Usuario_Admin) {
        this.Usuario_Admin = Usuario_Admin;
    }

    /**
     * @return the Senha_Admin
     */
    public String getSenha_Admin() {
        return Senha_Admin;
    }

    /**
     * @param Senha_Admin the Senha_Admin to set
     */
    public void setSenha_Admin(String Senha_Admin) {
        this.Senha_Admin = Senha_Admin;
    }
        }