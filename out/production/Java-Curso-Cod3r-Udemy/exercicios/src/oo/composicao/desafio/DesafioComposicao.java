package oo.composicao.desafio;

public class DesafioComposicao {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Maria");

		Produto prod1 = new Produto("Feijão 1kg", 9.90);
		Produto prod2 = new Produto("Arroz 1kg", 12.90);
		Produto prod3 = new Produto("Picanha 1kg", 89.90);
		Produto prod4 = new Produto("Bacon 500g", 18);
		Produto prod5 = new Produto("Tomate 1kg", 8);

		Compra compra1 = new Compra();
		compra1.adicionarItens(new Item[] { 
				new Item(prod1, 2),
				new Item(prod3, 1),
				new Item(prod2, 3),
				new Item(prod5, 0.8),
				new Item(prod4, 0.5)
			});

		Compra compra2 = new Compra();
		compra2.adicionarItens(new Item[] { 
				new Item(prod1, 4),
				new Item(prod2, 6),
				new Item(prod5, 1),
			});

		c1.adicionarCompra(compra1);
		c1.adicionarCompra(compra2);

//		System.out.println(c1.compras.get(0).cliente.nome);
//		System.out.println(c1.nome);
//		MESMO RETORNO
		
		System.out.println("Historico de Compras - Cliente " + c1.nome);
		for (int i = 0; i < c1.compras.size(); i++) {
			System.out.println("- Compra " + (i + 1) + " (" + c1.compras.get(i).cliente.nome + ")");
			System.out.println("	== Produto(Quantidade) | Valor Unitário | Valor Total ==");

			for (Item item : c1.compras.get(i).itens) {
				System.out.printf("	  \"%s\"(Qtde: %.3f) | R$%.2f | R$%.2f\n", 
						item.produto.nome, item.quantidade, item.produto.preco, item.valorTotal());
			}
			System.out.println();
		}

		System.out.printf("O(a) Cliente %s gastou no total: R$%.2f", c1.nome, c1.obterGastoTotal());
	}
}
