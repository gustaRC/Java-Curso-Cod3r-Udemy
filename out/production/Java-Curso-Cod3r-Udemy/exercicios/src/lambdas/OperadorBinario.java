package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {

// 		Os dois paramêtro e o retorno possuem o mesmo tipo
		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
		System.out.println(media.apply(9.8, 4.0));

//		Define o tipo do primeiro paramêtro, o tipo do segundo paramêtro e o tipo do retorno
		BiFunction<Double, Double, String> resultado = (n1, n2) -> ((n1 + n2) / 2) >= 7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado.apply(9.8, 4.0));

//		Define o tipo do paramêtro e o tipo do retorno
		Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";

		System.out.println(media.andThen(conceito).apply(8.9, 2.9));
	}
}
