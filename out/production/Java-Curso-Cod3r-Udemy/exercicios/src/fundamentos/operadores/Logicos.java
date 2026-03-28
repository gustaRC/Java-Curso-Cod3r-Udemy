package fundamentos.operadores;

public class Logicos {

	public static void main(String[] args) {

		boolean condicao1 = true;
		boolean condicao2 = 3 > 7; // == false

		System.out.println("E- &&: " + (condicao1 && condicao2));
		System.out.println("OU- ||: " + (condicao1 || condicao2));
		System.out.println("OU EXCLUSIVO- ^: " + (condicao1 ^ condicao2));
		System.out.println("NEGAÇÃO- !: " + !condicao1);
		System.out.println("NEGAÇÃO- !: " + !condicao2);

		// Tabelas verdades
		System.out.println("\nTabela Verdade E/AND (&&)");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);

		System.out.println("\nTabela Verdade OU/OR (||)");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);

		System.out.println("\nTabela Verdade NEGAÇÃO/NOT (!)");
		System.out.println(!true);
		System.out.println(!!true);
		System.out.println(!false);
		System.out.println(!!false);
	}
}
