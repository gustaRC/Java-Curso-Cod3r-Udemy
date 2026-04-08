package jdbc;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtualizarRegistroDesafio {
//  DESAFIO: Atualizar um registro desejado pelo usuário. Usuário deverá inserir o nome da pessoa que será alterado, depois inserir o valor para substituição
//  Exemplo da requisição: update pessoas set nome = 'Ana Pinheiro Rocha' where codigo = 101;

    public static void main(String[] args) throws SQLException {

        Scanner scanner = new Scanner(System.in);
        Connection conexao = FabricaConexao.getConexao();

        List<Pessoa> pessoas = new ArrayList<>();
        int codigoDesejado = 0;
        String nome = "";
        int sair = 0;

        String sqlConsulta = """
            select * from pessoas where nome like ?;
        """;
        String sqlEdicao = """
            update pessoas set nome = ? where id = ?;
        """;

        PreparedStatement stmtConsulta = conexao.prepareStatement(sqlConsulta);

        while (sair != 1) {
//          PROCESSAR NOME DIGITADO + POPULAR LISTA COM VALORES ENCONTRADOS
            System.out.print("Digite o nome que será alterado: ");
            nome = "%" + scanner.nextLine().trim() + "%";

            System.out.println(">> Processando...\n");

            stmtConsulta.setString(1, nome);
            ResultSet resultadoConsulta = stmtConsulta.executeQuery();

            while (resultadoConsulta.next()) {
                int idPessoa  = resultadoConsulta.getInt("id");
                String nomePessoa = resultadoConsulta.getString("nome");
                pessoas.add(new Pessoa(idPessoa, nomePessoa));
            }

//          TRATATIVA DOS VALORES ENCONTRADOS
            if (pessoas.isEmpty()) {
                System.out.println(">> Nenhum valor encontrado! :(");
                System.out.println(">> Favor realize uma nova busca.");
            } else if (pessoas.size() == 1) {
                System.out.println(">> Valor encontrado: " + pessoas.get(0).getCodigo() + " | " + pessoas.get(0).getNome());
                codigoDesejado = pessoas.get(0).getCodigo();
                sair = 1;
            } else if (pessoas.size() > 1) {
//              SELEÇÃO DADOS ENCONTRADOS
                System.out.println(">> Mais de um valor encontrado:");
                System.out.println(">> ID | NOME");
                pessoas.forEach(
                        p -> System.out.println(">> " + p.getCodigo() + " | " + p.getNome())
                );

                while (sair != 1) {
                    System.out.print("\nFavor digite o código desejado para edição: ");

//                  VERIFICATIVA SE O VALOR DIGITADO É VALIDO
                    if (scanner.hasNextInt()) {
                        final int provisorio = scanner.nextInt();
                        scanner.nextLine();

                        if (pessoas.stream().anyMatch(p -> p.getCodigo() == provisorio)) {
                            codigoDesejado = provisorio;
                            sair = 1;
                            break;
                        } else {
                            System.out.println(">> ERRO - Código digitado não encontrado na lista!");
                        }
                    } else {
                        scanner.nextLine();
                        System.out.println(">> ERRO - Digite um número valido!");
                    }
                }

            }
        }

//      EDIÇÃO
        System.out.print("\nDigite o novo nome para alteração: ");
        nome = scanner.nextLine();

        PreparedStatement stmtEdicao = conexao.prepareStatement(sqlEdicao);
        stmtEdicao.setString(1, nome);
        stmtEdicao.setInt(2, codigoDesejado);

        try {
            stmtEdicao.executeUpdate();

            System.out.println("\n>> Valor editado com sucesso!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Encerrando aplicação...");

        scanner.close();
        stmtConsulta.close();
        stmtEdicao.close();
        conexao.close();
    }
}
