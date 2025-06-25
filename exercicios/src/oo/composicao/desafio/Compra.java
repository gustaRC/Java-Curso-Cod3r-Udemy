package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {

	ArrayList<Item> itens = new ArrayList<Item>();
	Cliente cliente;

	void adicionarItem(Item item) {
		item.compra = this;
		this.itens.add(item);
	}

	void adicionarItens(Item[] itens) {
		for (Item item : itens) {
			item.compra = this;
			this.itens.add(item);
		}
	}
}
