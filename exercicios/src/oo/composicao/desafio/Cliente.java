package oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {

	String nome;
	ArrayList<Compra> compras = new ArrayList<Compra>();

	Cliente(String nome) {
		this.nome = nome;
	}

	void adicionarCompra(Compra compra) {
		compra.cliente = this;
		compras.add(compra);
	}

	double obterGastoTotal() {
		double gastoTotal = 0;

		for (Compra compra : compras) {
			for (Item item : compra.itens) {
				gastoTotal += item.valorTotal();
			}
		}

		return gastoTotal;
	}
}
