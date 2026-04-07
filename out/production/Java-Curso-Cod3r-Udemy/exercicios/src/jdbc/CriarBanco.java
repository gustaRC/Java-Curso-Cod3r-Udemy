package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {

    public static void main(String[] args) throws SQLException {

        String endpointConexao = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true";
        String usuario = "root";
        String senha = "Gu021204$";

        Connection conexao = DriverManager.getConnection(endpointConexao, usuario, senha);

        Statement stmt = conexao.createStatement();
        stmt.execute("CREATE DATABASE IF NOT EXISTS cursoCoder_java");
        // execute: executa comandos SQL

        System.out.println("Banco de dados criado com sucesso!");
        conexao.close();
    }
}
