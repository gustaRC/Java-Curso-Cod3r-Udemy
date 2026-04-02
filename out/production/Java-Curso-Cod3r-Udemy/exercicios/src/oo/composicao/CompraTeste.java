package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {

		Compra compra1 = new Compra();
		compra1.cliente = "João";
		compra1.adicionarItem(new Item("Caneta", 20, 7.50));
		compra1.adicionarItem(new Item("Borracha", 12, 3.89));
		compra1.itens.add(new Item("Caderno", 5, 14.80));

		System.out.println(compra1.itens.size());
		System.out.println(compra1.obterValorTotal());

		System.out.println(compra1.itens.get(0).compra.itens.get(1).compra.obterValorTotal()); // == mesmo valor
	}
}
