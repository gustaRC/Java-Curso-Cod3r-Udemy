package controle.exerciciosExtras;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		final int valorAleatorio = 50;
		int valorDigitado = 0;

		System.out.println("--- Iniciado Aplicação --- Adivinhe o número aleátorio (0 - 100)");
		for (int i = 10; i > 0; i--) {
			System.out.printf("\nRestam %d tentativas.", i);

			System.out.print("\nDigite um número (0 - 100): ");
			valorDigitado = scanner.nextInt();

			if (valorDigitado == valorAleatorio) {
				System.out.println("\nParabéns!! Você acertou o número aleátorio ;D");
				break;
			} else if ((valorAleatorio - valorDigitado) > 0) {
				System.out.println("Errou. Tente novamente! - Dica: MAIOR...");
			} else {
				System.out.println("Errou. Tente novamente! - Dica: MENOR...");
			}
		}

		if (valorDigitado != valorAleatorio) {
			System.out.println("\nAcabou as suas tentativas. Tente novamente!");
		}

		System.out.println("\nAplicação Encerrada!");
		scanner.close();
	}
}
