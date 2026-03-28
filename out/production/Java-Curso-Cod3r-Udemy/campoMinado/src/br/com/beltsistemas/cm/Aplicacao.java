package br.com.beltsistemas.cm;

import br.com.beltsistemas.cm.modelo.Tabuleiro;
import br.com.beltsistemas.cm.visao.TabuleiroConsole;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(8, 6, 6);
		
		new TabuleiroConsole(tabuleiro);
	}
}
