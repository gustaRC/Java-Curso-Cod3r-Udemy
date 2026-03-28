package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double valorDigitado = 0;
		double totalNotas = 0;
		int qtdeNotasValidas = 0;

		System.out.println("-->  Iniciado Aplicação para Calcular Médias! "
				+ "- Digite -1 para SAIR  <--");
		
		while (valorDigitado != -1) {
			System.out.print("Digite uma nota (0 <-> 10): ");
			valorDigitado = scanner.nextDouble();
			
			if (valorDigitado >= 0 && valorDigitado <= 10) {
				totalNotas += valorDigitado;
				qtdeNotasValidas++;
				
				System.out.printf("- Total Notas: %.2f.\n\n", totalNotas);
				
			} else if (valorDigitado != -1) {
				System.out.println("Nota inválida! Digite um valor entre 0 a 10.\n");
			}
		}
		
		System.out.printf("\nMédia geral da turma: %.2f.", totalNotas / qtdeNotasValidas);
		System.out.println("\nAplicação encerrada!");
		
		scanner.close();
	}
}
