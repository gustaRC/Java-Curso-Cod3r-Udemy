package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoasDesafio {
//  DESAFIO: Realizar um scanner para realizar select com "like" para buscar inicio/fim de nomes da tabela pessoas

    public static void main(String[] args) throws SQLException {

        Connection conexao = FabricaConexao.getConexao();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite alguma referencia ou nome para buscar: ");
        String referenciaNome = "%" + scanner.nextLine().trim() + "%";

        String sql = """
            select * from pessoas where nome like ?;
        """;

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, referenciaNome);
        ResultSet resultado = stmt.executeQuery();

        System.out.println("Resultados encontrados: ");
        System.out.println("ID | NOME");

        List<Pessoa> pessoas = new ArrayList<>();

        while(resultado.next()) {
            int id = resultado.getInt("id");
            String nome = resultado.getString("nome");
            pessoas.add(new Pessoa(id, nome));
        }

        pessoas.stream().forEach(
                p -> System.out.println(p.getCodigo() + " | " + p.getNome())
        );

        System.out.println("\nConsulta realizada com sucesso!");

        scanner.close();
        stmt.close();
        conexao.close();
    }
}
