package fundamentos.operadores;

public class Atribuicao {

	public static void main(String[] args) {

		int a = 3;
		int b = a;
		int c = a + b;

		c += b; // c = c + b
		c -= a; // c = c - b
		c *= a; // c = c * b
		c /= a; // c = c / b
		c %= a; // c = c % b
	}
}
