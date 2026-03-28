package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String texto = "por favor";
		
		do {
			System.out.println("Diga as palavras mágicas para sair...");
			texto = scanner.nextLine();
		} while(!texto.equalsIgnoreCase("por favor"));

		scanner.close();
	}
}
