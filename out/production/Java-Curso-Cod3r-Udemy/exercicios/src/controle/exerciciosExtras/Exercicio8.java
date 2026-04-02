package controle.exerciciosExtras;

import java.util.Scanner;

public class Exercicio8 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		double valorDigitado;
		double maiorValor = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite a nota " + i + " : ");
			
			valorDigitado = scanner.nextDouble();
			maiorValor = valorDigitado > maiorValor ? valorDigitado : maiorValor;
		}

		System.out.printf("\nO maior valor digitado foi: %.2f", maiorValor);
		scanner.close();
	}
}
