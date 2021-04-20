package br.com.Controller;

import TestedaConexao.ConnectionFactory;
import br.com.View.Menu_Adm;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Administrador_Controller {

    private Connection conexao;

    public Administrador_Controller() {

        this.conexao = new ConnectionFactory().getConnection();

    }

    public void logar(String usuario, String senha) {

        try {

            String sql = " select * from administrador where Usuario_Admin  =? and Senha_Admin  =? ";
            PreparedStatement pst = conexao.prepareStatement(sql);
            pst.setString(1, usuario);
            pst.setString(2, senha);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                JOptionPane.showMessageDialog(null, "Seja Bem Vindo ao Meu Bicinho " + usuario);
                Menu_Adm menu = new Menu_Adm();
                menu.setVisible(true);
            } else {

                JOptionPane.showMessageDialog(null, "Usuário ou senha Invalida");
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Erro por algum motivo " + e);

        }
    }

}
