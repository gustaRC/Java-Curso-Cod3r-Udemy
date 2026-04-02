package oo.composicao.desafio;

public class Item {

	Produto produto;
	double quantidade;
	Compra compra;

	Item() {
	}

	Item(Produto produto, double quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}

	double valorTotal() {
		return produto.preco * quantidade;
	}
}
