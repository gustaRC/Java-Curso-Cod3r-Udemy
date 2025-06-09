package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o Primeiro Salário: ");
		double salario1 = Double.parseDouble(
					scanner.next().replace(",", "."));

		System.out.print("Digite o Segundo Salário: ");
		double salario2 = Double.parseDouble(
					scanner.next().replace(",", "."));

		System.out.print("Digite o Terceiro Salário: ");
		double salario3 = Double.parseDouble(
					scanner.next().replace(",", "."));

		double salarioTotal = salario1 + salario2 + salario3;
		double mediaSalarios = salarioTotal / 3; 
		
		System.out.printf(
				"\nSalários:\n - 1º: R$%.2f;\n - 2º: R$%.2f;\n - 3º: R$%.2f.\n",
				salario1, salario2, salario3);

		System.out.printf(
				"\nTotal: R$%.2f  ---  Média: R$%.2f",
				salarioTotal, mediaSalarios);
		
		scanner.close();
	}
}
