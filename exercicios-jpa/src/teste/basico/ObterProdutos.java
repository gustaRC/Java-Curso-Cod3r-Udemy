package teste.basico;

import infra.ProdutoDAO;
import modelo.basico.Produto;

import java.util.List;

public class ObterProdutos {

    public static void main(String[] args) {

        ProdutoDAO prodDao = new ProdutoDAO();
        List<Produto> produtos = prodDao.obterTodos();

        for (Produto produto : produtos) {
            System.out.println(
                "ID: " + produto.getId() +
                ", Nome: " + produto.getNome() +
                ", Preço: R$" + produto.getPreco()
            );
        }

        double precoTotal = produtos.stream()
                .map(p -> p.getPreco())
                .reduce(
                    0.0 /*valor inicial*/,
                    (total /*acc*/, preco /*item atual*/) -> total + preco
                );

        System.out.println("Valor total dos Produtos: R$" + precoTotal);

        prodDao.fecharConexao();
    }
}
