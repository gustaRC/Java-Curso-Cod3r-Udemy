package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		/*
		 * 1. A partir do produto calcular o preço real (com desconto)
		 * 2. Imposto Municipal: >= 2500 (8,5%)| < 2500 (Isento)
		 * 3. Frete: >= 3000 (100)| < 3000 (50)
		 * 4. Arrendodar: Deixar duas casa decimais
		 * 5. Formatar: R$1234,56
		 * */
		
		Function<Produto, Double> precoComDesconto = prod -> prod.preco * (1 - prod.desconto);
		
		UnaryOperator<Double> precoComImpostoMunicipal = preco -> 
			(preco >= 2500) ? (((8.5 / 100) * preco) + preco) : preco;
		
		UnaryOperator<Double> adicionarFrete = preco -> (preco >= 3000) ? (preco + 100) : (preco + 50);

		UnaryOperator<Double> arredondarPara2CasasDecimais = valor -> Math.round(valor * 100.0) / 100.0;
//		PROFESSOR -> UnaryOperator<Double> arredondarPara2CasasDecimais = valor -> Double.parseDouble(String.format("%.2f", valor));
		
		Function<Double, String> precoFormatado = preco -> {
			String precoComCifrao = "R$" + preco;
			
			return precoComCifrao.replace(".", ",");
		};
		
		Produto p = new Produto("iPad", 3235.89, 0.13);
		
		Double pComDesconto = precoComDesconto.apply(p);
		System.out.printf("Preço com Desconto: %f.\n", pComDesconto);
		
		Double pComDescontoComImposto = precoComImpostoMunicipal.apply(pComDesconto);
		System.out.printf("+ Imposto Municipal: %f.\n", pComDescontoComImposto);
		
		Double pComDescontoComImpostoComFrete = adicionarFrete.apply(pComDescontoComImposto);
		System.out.printf("+ Frete: %f.\n", pComDescontoComImpostoComFrete);
		
		Double pComDescontoComImpostoComFreteArredondado = arredondarPara2CasasDecimais.apply(pComDescontoComImpostoComFrete);
		System.out.printf("Valor arredondado: %f.\n", pComDescontoComImpostoComFreteArredondado);
		
		String pComTributosFormatado = precoFormatado.apply(pComDescontoComImpostoComFreteArredondado);
		System.out.printf("Preço com Tributo Formatado: %s.\n", pComTributosFormatado);

		String precoFinal = precoComDesconto
				.andThen(precoComImpostoMunicipal)
				.andThen(adicionarFrete)
				.andThen(arredondarPara2CasasDecimais)
				.andThen(precoFormatado)
				.apply(p);
		System.out.println("\nPreço final: " + precoFinal);
		
	}
}
