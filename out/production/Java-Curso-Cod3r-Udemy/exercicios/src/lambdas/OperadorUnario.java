package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {
		
		// O mesmo tipo do paramêtro, é o mesmo tipo do retorno
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		int resultado1 = maisDois // 0 + 2 = 2
				.andThen(vezesDois) // 2 * 2 = 4
				.andThen(aoQuadrado) // 4 * 4 = 16
				.apply(0);
		
		System.out.println(resultado1);
		
//		compose é o contrario do andThen, ou seja, atribuimos o que executará antes
//		antes de executar aoQuadrado, exectutará o vezesDois, e antes disso o maisDois
		int resultado2 = aoQuadrado // 3º
				.compose(vezesDois) // 2º
				.compose(maisDois) // 1º
				.apply(0);
		
		System.out.println(resultado2);
	}
}
