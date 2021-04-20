package TestedaConexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

    public Connection getConnection() {

        try {
            // a linha descrita abaixo retorna o DriveManager, que será então a conexão.
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/sisanimaly", "root", "");
        } catch (Exception err) {
            //retornano mensagem de erro
            throw new RuntimeException(err);
        }
    }
}
