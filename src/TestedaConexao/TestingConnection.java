package TestedaConexao;

import TestedaConexao.ConnectionFactory;
import javax.swing.JOptionPane;

public class TestingConnection {

//testando a conexao com o método principal
    public static void main(String[] args) {

        try {
            new ConnectionFactory().getConnection();
            JOptionPane.showMessageDialog(null, "Conexão bem sucedida!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado: " + e);

        }

    }

}
