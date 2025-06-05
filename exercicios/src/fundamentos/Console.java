package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia!\n");
		
		System.out.println("Boa");
		System.out.println(" tarde!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d \n", 1, 2, 3, 4, 5, 6);
		
		System.out.printf("Salário: %.1f\n", 2340.1235);
		
		//Scanner - entrada
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.print("Digite o seu salário: ");
		double salario = entrada.nextDouble();
		
		System.out.printf("%s %s tem %d anos e ganha %.2f.",
				nome, sobrenome, idade, salario);
		
		entrada.close();
	}
}