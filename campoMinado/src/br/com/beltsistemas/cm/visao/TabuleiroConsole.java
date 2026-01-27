package br.com.beltsistemas.cm.visao;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import br.com.beltsistemas.cm.excecao.ExplocaoException;
import br.com.beltsistemas.cm.excecao.SairException;
import br.com.beltsistemas.cm.modelo.Tabuleiro;

public class TabuleiroConsole {

	private Tabuleiro tabuleiro;
	
	private Scanner entrada = new Scanner(System.in);

	public TabuleiroConsole(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		
		executarJogo();
	}

	private void executarJogo() {
		try {
			boolean continuar = true;
			
			while (continuar) {
				cicloDoJogo();
				
				System.out.println("Outra Partida? (S/n)");
				String resposta = entrada.nextLine();
				
				if ("n".equalsIgnoreCase(resposta)) {
					continuar = false;
					tabuleiro.reiniciar();
				}
				
			}
			
		} catch (SairException e) {
			System.out.println("Tchau!!!");
		} finally {
			entrada.close();
		}
	}

	private void cicloDoJogo() {
		try {
			while(!tabuleiro.objetivoAlcancado()) {
				System.out.println(tabuleiro);
				
				String digitado = capturarValorDigitado("Digite (L, C): ");
				
				Iterator<Integer> xy = Arrays.stream(digitado.split(","))
					.map(e -> Integer.parseInt(e.trim()))
					.iterator();
				
				digitado = capturarValorDigitado("\nMenu \n 1- Abrir; \n 2- (Des)Marcar; \n SAIR- Encerrar. \n-> Opção desejada: ");
				
				if (digitado.equals("1")) {
					tabuleiro.abrir(xy.next(), xy.next());
				} else if (digitado.equals("2")) {
					tabuleiro.alternarMarcacao(xy.next(), xy.next());
				}
			}
			
			System.out.println("Você ganhou!");
		} catch (ExplocaoException e) {
			System.out.println("Você perdeu!");
		}
	}
	
	private String capturarValorDigitado(String texto) {
		System.out.print(texto);
		String valorDigitado = entrada.nextLine();
		
		if("sair".equalsIgnoreCase(valorDigitado)) {
			throw new SairException();
		}
		
		return valorDigitado;
	}
	
}
