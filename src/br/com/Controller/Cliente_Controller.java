package br.com.Controller;

import TestedaConexao.ConnectionFactory;
import br.com.View.Menu_Adm;
import br.com.View.Menu_Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Cliente_Controller {

    private Connection conexao;

    public Cliente_Controller() {
        this.conexao = new ConnectionFactory().getConnection();

    }

    public void logar(String usuario, String senha) {

        try {

            String sql = " select * from table_usuario where Login_User =? and Senha_User =? ";
            PreparedStatement pst = conexao.prepareStatement(sql);
            pst.setString(1, usuario);
            pst.setString(2, senha);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                if (usuario != usuario) {
                    JOptionPane.showMessageDialog(null, "erro de user ");
                } else {

                    JOptionPane.showMessageDialog(null, "Seja Bem Vindo ao Meu Bicinho " + usuario);
                    Menu_Usuario menu = new Menu_Usuario();
                    menu.setVisible(true);
                }

            }// else {
            //
            //  JOptionPane.showMessageDialog(null,"Usuário ou senha Invalida");

            //} 
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Erro por algum motivo " + e);

        }
    }
}
