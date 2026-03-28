package controle.exerciciosExtras;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double valorDigitado = 0;
		double totalValor = 0;
		
		System.out.println("--- Aplicação Iniciada - Digite um número negativo para SAIR ---");
		do {
			System.out.print("Digite algum número: ");
			valorDigitado = scanner.nextDouble();
			
			if(valorDigitado > -1) {
				totalValor += valorDigitado;
			}
			
			System.out.printf("- Total: %.2f\n", totalValor);
		} while (valorDigitado > -1);

		System.out.println("\nAplicação Encerrada!");
		scanner.close();
	}
}
