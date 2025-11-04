package excecao;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {

		System.out.print("Digite algum número: ");
		Scanner entrada = new Scanner(System.in);

		try {
			System.out.println(7 / entrada.nextInt());

		} catch (Exception e) {
			System.out.println("ERRO -> " + e.getMessage());
		} finally {
//			sempre cairá aqui, mesmo que ocorra exceção ou não, o finally sempre será chamado!
			System.out.println("Finalizado operação!");
			entrada.close();
		}

		System.out.println("Fim :)");
	}
}
