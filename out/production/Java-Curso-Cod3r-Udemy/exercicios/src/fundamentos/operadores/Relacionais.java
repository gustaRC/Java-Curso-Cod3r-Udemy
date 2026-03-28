package fundamentos.operadores;

public class Relacionais {

	public static void main(String[] args) {

		int a = 97;
		int b = 'a'; // tabela unicode
//		System.out.println(a == b);

		System.out.println("Maior (>): " + (3 > 4));
		System.out.println("Maior Igual (>=): " + (3 >= 3));
		System.out.println("Menor (<): " + (3 < 4));
		System.out.println("Menor Igual (<=): " + (6 <= 4));
		System.out.println("Igual (==): " + (320 == 10));
		System.out.println("Diferente (!=): " + (1 != 9));
		
		
		double nota = 7.5;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto? " + temDesconto);
	}
}
