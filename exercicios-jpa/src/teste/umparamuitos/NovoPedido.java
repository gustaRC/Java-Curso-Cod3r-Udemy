package teste.umparamuitos;

import infra.DAO;
import modelo.basico.Produto;
import modelo.umparamuitos.ItemPedido;
import modelo.umparamuitos.Pedido;

import java.util.Date;

public class NovoPedido {

    public static void main(String[] args) {

        DAO<Object> dao = new DAO<>();

        Pedido pedido = new Pedido(new Date(), "pedido teste");
        Produto produto1 = new Produto("Microondas", 389.90);
        Produto produto2 = new Produto("Panela", 46.90);
        Produto produto3 = new Produto("TV 40 polegadas", 1459.90);
        ItemPedido item1 = new ItemPedido(pedido, produto1, 5);
        ItemPedido item2 = new ItemPedido(pedido, produto2, 25);
        ItemPedido item3 = new ItemPedido(pedido, produto3, 10);

        dao
            .abrirTransacao()
            .incluir(pedido)
            .incluir(produto1)
            .incluir(produto2)
            .incluir(produto3)
            .incluir(item1)
            .incluir(item2)
            .incluir(item3)
            .fecharTransacao()
            .fecharConexao();
    }
}
