package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

    public static void main(String[] args) throws SQLException {

        Connection conexao = FabricaConexao.getConexao();
        Scanner scanner = new Scanner(System.in);

        String sql = """
            DELETE FROM pessoas WHERE id = ?;
        """;

        System.out.print("Informe o código: ");
        int codigo = scanner.nextInt();

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, codigo);

        if (stmt.executeUpdate() > 0) {
            System.out.println("Pessoa excluida com sucesso!");
        } else {
            System.out.println("Operação não foi concluída!");
        }

        conexao.close();
        scanner.close();
    }
}
