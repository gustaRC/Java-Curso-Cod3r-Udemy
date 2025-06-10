package fundamentos.operadores;

public class Aritmeticos {

	public static void main(String[] args) {

		System.out.println(2 + 3);

		// Tipo double
		var x = 35.04;
		double y = 2.7;

		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);

		System.out.println(); // pular linha

		// Tipo int
		int a = 10;
		int b = 4;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a / (double) b);
		System.out.println(a % b); // resto da divisão
	}
}
