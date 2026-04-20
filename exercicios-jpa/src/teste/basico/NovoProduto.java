package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {

    public static void main(String[] args) {

        DAO< Produto> dao = new DAO<>(Produto.class);

        Produto produto = new Produto("Mouse", 49.75);
//      dao.abrirTransacao().incluir(produto).fecharTransacao().fecharConexao();
        dao.incluirAtomico(produto).fecharConexao();

        System.out.println("ID do Produto: " + produto.getId());
    }
}
