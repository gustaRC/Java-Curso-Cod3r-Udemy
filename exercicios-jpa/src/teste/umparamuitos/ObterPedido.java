package teste.umparamuitos;

import infra.DAO;
import modelo.umparamuitos.ItemPedido;
import modelo.umparamuitos.Pedido;

public class ObterPedido {

    public static void main(String[] args) {

        DAO<Pedido> dao = new DAO<>(Pedido.class);

        Pedido pedido = dao.obterPorId(2L);

        for (ItemPedido item : pedido.getItens()) {
            System.out.printf("Pedido Número %d (Obs.: %s) - %s " +
                            "\n - Item ID: %d | Produto ID: %d | Produto Nome: %s | Item Quantidade: %d | Item Preço: R$%.2f",
                    item.getPedido().getId(),
                    item.getPedido().getDescricao(),
                    item.getPedido().getData(),
                    item.getId(),
                    item.getProduto().getId(),
                    item.getProduto().getNome(),
                    item.getQuantidade(),
                    item.getPreco()
            );
        }

    }
}
