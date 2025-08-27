package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		Produto p = new Produto("iPad", 3235.89, 0.13);
		
		/*
		 * 1. A partir do produto calcular o preço real (com desconto)
		 * 2. Imposto Municipal: >= 2500 (8,5%)| < 2500 (Isento)
		 * 3. Frete: >= 3000 (100)| < 3000 (50)
		 * 4. Arrendodar: Deixar duas casa decimais
		 * 5. Formatar: R$1234,56
		 * */
		
		Function<Produto, Double> precoComDesconto = prod -> prod.preco * (1 - prod.desconto);
		
		UnaryOperator<Double> precoComImpostoMunicipal = preco -> preco >= 2500 ? ((8.5 / 100) * preco) : preco;
	}
}
