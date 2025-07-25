package oo.composicao;

import java.util.ArrayList;

public class Compra {

	String cliente;
	ArrayList<Item> itens = new ArrayList<Item>();

	void adicionarItem(Item item) {
		item.compra = this; // BIDIMENSIONAL
		itens.add(item);
	}

	double obterValorTotal() {
		double total = 0;

		for (Item item : itens) {
			total += item.preco * item.quantidade;
		}

		return total;
	}
}
