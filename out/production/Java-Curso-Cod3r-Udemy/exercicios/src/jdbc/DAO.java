package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {

    private Connection conexao;

//  normalmente o DAO não possui o sql como parametro
    public int incluir(String sql, Object... atributos) {
        try {
            PreparedStatement stmt = getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            adicionarAtributos(stmt, atributos);

            if (stmt.executeUpdate() > 0) {
                ResultSet resultado = stmt.getGeneratedKeys();

                if (resultado.next()) {
                    return resultado.getInt(1);
                }
            }

            return -1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void adicionarAtributos(PreparedStatement stmt, Object[] atributos) throws SQLException{
        int indice = 1;
        for (Object atributo : atributos) {
            if (atributo instanceof String) {
                stmt.setString(indice, (String) atributo);
            } else if (atributo instanceof Integer) {
                stmt.setInt(indice, (Integer) atributo);
            }

            indice++;
        }
    }

    public void close() {
        try {
            getConexao().close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private Connection getConexao() {
        try {
            if (conexao != null && !conexao.isClosed()) {
                return conexao;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        conexao = FabricaConexao.getConexao();
        return conexao;
    }

//  exemplo método DAO - alto nível para fácil manipulação
/*  public class PessoaDAO {
        public void incluir(Pessoa p) {...}

        public void alterar(Pessoa p, int id) {...}

        public void deletar(int id) {...}
    }
*/
}
