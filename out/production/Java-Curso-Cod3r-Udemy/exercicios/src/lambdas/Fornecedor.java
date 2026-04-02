package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {

//		Não recebe nenhum parametro e retorna alguma coisa
//		Define o valor de retorno 
		Supplier<List<String>> umaLista = () -> Arrays.asList("Gu", "Gui", "Go");

		System.out.println(umaLista.get());
	}
}
