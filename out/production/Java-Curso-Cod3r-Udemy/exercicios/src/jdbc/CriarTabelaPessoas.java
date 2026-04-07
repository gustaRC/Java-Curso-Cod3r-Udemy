package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaPessoas {

    public static void main(String[] args) throws SQLException {

        Connection conexao = FabricaConexao.getConexao();

        String sql = """
            CREATE TABLE IF NOT EXISTS cursoCoder_java.pessoas (
                id INT AUTO_INCREMENT PRIMARY KEY,
                nome VARCHAR(80) NOT NULL
            );
        """;

        Statement stmt = conexao.createStatement();
//      Ao utilizar o Statement estamos sujeitos a ataques hackers de 'SQL Injections'
//      statement = 'declaração'
        stmt.execute(sql);

        System.out.println("Tabela criada com sucesso!");
        conexao.close();
    }
}
