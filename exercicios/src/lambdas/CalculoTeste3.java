package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {

		BinaryOperator<Double> calculo = (x, y) -> {
			return x + y;
		};
		System.out.println(calculo.apply(5.0, 5.0));

		calculo = (x, y) -> x * y;
		System.out.println(calculo.apply(5.0, 5.0));
		
		BinaryOperator<String> calculo2 = (x, y) -> {
			return x + y;
		};
		System.out.println(calculo2.apply("teste", " 1"));
		
		calculo = (x, y) -> x * y;
		System.out.println(calculo2.apply("teste", " 2"));
	}
}
