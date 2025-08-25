package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {

//		Recebe um único parametro e retorna um tipo pre-definido
//		Defino o tipo de entrada (paramêtro), Defino o tipo de saída (retorno)
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Ímpar";

		System.out.println(parOuImpar.apply(12));

		Function<String, String> oResultadoE = valor -> "O resultado é: " + valor;

		Function<String, String> empolgado = valor -> valor + "!!!";

		System.out.println(oResultadoE.apply(parOuImpar.apply(23)));

		String resultadoFinal = parOuImpar
				.andThen(oResultadoE)
				.andThen(empolgado)
				.apply(74);
		System.out.println(resultadoFinal);

//		Principal utilidade do Function: Criar funções menores para reutilização;
//		Ao invés de termos uma única e extensa função, quebramos ela em partes menores com Functional Interfaces.
	}
}
