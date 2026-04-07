package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {

    public static void main(String[] args) throws SQLException {

        Connection conexao = FabricaConexao.getConexao();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome: ");
        String nome = scanner.nextLine().trim();

        String sql = """
            insert into pessoas (nome) values (?);
        """;

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, nome);
//      Com o PreparedStatement podemos executar comandos mais seguros, evitando ataques de 'SQL Injections'
//      e também podemos utilizar parâmetros para inserir valores dinamicamente, sem precisar concatenar strings, o que torna o código mais limpo e SEGURO.

        stmt.execute();

        System.out.println("Pessoa adicionada com sucesso!");
        scanner.close();
        stmt.close();
        conexao.close();
    }
}
