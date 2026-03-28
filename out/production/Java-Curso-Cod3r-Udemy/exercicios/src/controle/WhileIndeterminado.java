package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {

		//MINI DESAFIO
		Scanner scanner = new Scanner(System.in);
		
		String valor = "";
		double numero;
		
		while (!valor.equalsIgnoreCase("sair")) {
			System.out.print("Digite algum número para saber se é PAR ou IMPAR:"
					+ "\n- Para sair da aplicação digite: 'sair'\n");
			valor = scanner.next();
			
			if(!valor.equalsIgnoreCase("sair")) {
				numero = Double.parseDouble(valor) % 2;
				
				if(numero == 0) {
					System.out.println("\nO número digitado é PAR!\n");
				} else {
					System.out.println("\nO número digitado é IMPAR!\n");
				}
			}
		}
		
		System.out.println("\nEncerrado aplicação!");
		
		//PROFESSOR
//		valor = "";
//		while (!valor.equalsIgnoreCase("sair")) {
//			System.out.print("Você diz: ");
//			valor = scanner.nextLine();
//		}
		
		scanner.close();
	}
}
