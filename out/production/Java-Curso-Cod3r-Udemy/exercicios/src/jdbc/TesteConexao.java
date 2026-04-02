package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {

    public static void main(String[] args) throws SQLException {
        
        final String stringDeConexao = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true";
//      verifyServerCertificate é uma medida de proteção do jdbc/db, estamos desabilitando para evitar warning
//      useSSL é para usar o protocolo de segurança SSL, ou seja, deixar mais seguro a conexão, estamos habilitando para evitar warning
        final String usuario = "root";
        final String senha = "Gu021204$";

        Connection conexao = DriverManager.getConnection(stringDeConexao, usuario, senha);
//      necessário instalar o driver do MySQL para o Java, o Connector/J (Plataform Independent), e adicioná-lo ao classpath do projeto para que a conexão funcione corretamente.
//      baixamos e alocamos na pasta "libs"
//      na opção "Project Structure" > Libraries > Add(+) > Java > Selecionar arquivo .jar > Apply > Fechar

        System.out.println("Conexão efetuada com sucesso!");
        conexao.close();
    }
}
