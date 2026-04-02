package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {

	ArrayList<Item> itens = new ArrayList<Item>();
	Cliente cliente;

//	set indireto
	void adicionarItem(Item item) {
		item.compra = this;
		this.itens.add(item);
	}
	
//	set indireto
	void adicionarItens(Item[] itens) {
		for (Item item : itens) {
			item.compra = this;
			this.itens.add(item);
		}
	}

	double obterValorTotal() {
		double total = 0;

		for (Item item : itens) {
			total += item.valorTotal();
		}

		return total;
	}
}
