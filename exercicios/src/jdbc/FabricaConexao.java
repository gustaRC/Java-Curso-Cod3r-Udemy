package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {

    public static Connection getConexao() {
        try {
            String endpointConexao = "jdbc:mysql://localhost:3306/cursocoder_java?verifyServerCertificate=false&useSSL=true";
            String usuario = "root";
            String senha = "Gu021204$";

            return DriverManager.getConnection(endpointConexao, usuario, senha);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
