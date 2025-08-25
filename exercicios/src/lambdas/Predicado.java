package lambdas;

import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {

//		Recebe um único paramêtro e retorna boolena
		Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) > 750;

		Produto produto = new Produto("Notebook", 2390, 0.15);
		System.out.println(isCaro.test(produto));
	}
}
