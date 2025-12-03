package br.com.beltsistemas.cm.modelo;

import java.util.ArrayList;
import java.util.List;

import br.com.beltsistemas.cm.excecao.ExplocaoException;

public class Campo {

	private final int linha;
	private final int coluna;

	private boolean aberto; // por padrão, o valor de boolean quando não atribuido é 'false'
	private boolean minado = false;
	private boolean marcado = false;

	private List<Campo> vizinhos = new ArrayList<Campo>();

	Campo(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}

	boolean adicionarVizinho(Campo vizinho) {
		boolean linhaDiferente = linha != vizinho.linha;
		boolean colunaDiferente = coluna != vizinho.coluna;
		boolean diagonal = linhaDiferente && colunaDiferente;

		int deltaLinha = Math.abs(linha - vizinho.linha);
		int deltaColuna = Math.abs(coluna - vizinho.coluna);
		int deltaGeral = deltaColuna + deltaLinha;

		if ((deltaGeral == 1 && !diagonal) || (deltaGeral == 2 && diagonal)) {
			vizinhos.add(vizinho);
			return true;
		} else {
			return false;
		}
	}

	void alternarMarcacao() {
		if (!aberto) {
			marcado = !marcado;
		}
	}

	boolean abrir() {

		if (!aberto && !marcado) {
			aberto = true;

			if (minado) {
				throw new ExplocaoException();
			}

			if (vizinhancaSegura()) {
				vizinhos.forEach(v -> v.abrir());
			}

			return true;
		} else {
			return false;
		}
	}

	boolean vizinhancaSegura() {
		System.out.println(vizinhos.stream().noneMatch(v -> v.minado));
		//se nenhum vizinho der um match no predicado (ou seja, se minado for true, logo se estiver minado) retornará 'true'
		//caso algum vizinho esteja minado, retornará 'false'
		return vizinhos.stream().noneMatch(v -> v.minado); //noneMatch === nenhum bateu, nenhum item atendeu os requisitos ? true : false
	}

}
