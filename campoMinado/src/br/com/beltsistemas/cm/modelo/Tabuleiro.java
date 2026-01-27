package br.com.beltsistemas.cm.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Tabuleiro {

	private int linhas;
	private int colunas;
	private int minas;

	private final List<Campo> campos = new ArrayList<>();

	public Tabuleiro(int linhas, int colunas, int minas) {
		this.linhas = linhas;
		this.colunas = colunas;
		this.minas = minas;

		gerarCampos();
		associarVizinho();
		sortearMinas();
	}

	public void abrir(int linha, int coluna) {
		campos.parallelStream()
			.filter(c -> (c.getLinha() == linha) && (c.getColuna() == coluna))
			.findFirst() //== operação finalizadora de stream
			.ifPresent(c -> c.abrir());
	}
	
	public void alternarMarcacao(int linha, int coluna) {
		campos.parallelStream()
		.filter(c -> (c.getLinha() == linha) && (c.getColuna() == coluna))
		.findFirst() //== operação finalizadora de stream
		.ifPresent(c -> c.alternarMarcacao());
	}

	private void gerarCampos() {
		for (int linha = 0; linha < linhas; linha++) {
			for (int coluna = 0; coluna < colunas; coluna++) {
				campos.add(new Campo(linha, coluna));
			}
		}
	}

	private void associarVizinho() {
		for (Campo c1 : campos) {
			for (Campo c2 : campos) {
				c1.adicionarVizinho(c2);
			}
		}
	}

	private void sortearMinas() {
		int minasArmadas = 0;
		Predicate<Campo> minado = c -> c.isMinado();

		do {
			// cast
			minasArmadas = (int) campos.stream().filter(minado).count();
			int aleatorio = (int) (Math.random() * campos.size());
			campos.get(aleatorio).minar();
		} while (minasArmadas < minas);
	}

	public boolean objetivoAlcancado() {
		return campos.stream().allMatch(c -> c.objetivoAlcancado());
	}

	public void reiniciar() {
		campos.stream().forEach(c -> c.reiniciar());
		sortearMinas();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

	    sb.append("  "); // espaço para alinhar com o "L0"
	    for (int coluna = 0; coluna < colunas; coluna++) {
	        sb.append("  C").append(coluna).append(" ");
	    }
	    sb.append("\n");
		
		int i = 0;
		for (int linha = 0; linha < linhas; linha++) {
			sb.append("L").append(linha);
			for (int coluna = 0; coluna < colunas; coluna++) {
				sb.append(" ");
				sb.append("|" + campos.get(i) + "|");
				sb.append(" ");
				i++;
			}

			sb.append("\n");
		}

		return sb.toString();
	}

}
