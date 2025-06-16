package classe;

public class ProdutoInstanciado {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4490.90);
		
		var p2 = new Produto();
		p2.nome = "Caneca Preta";
		p2.preco = 12.50;
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		
		System.out.printf("Média do Carrinho: R$%.2f", (precoFinal1 + precoFinal2) / 2);
		
		Produto.desconto = 0.30;
		System.out.println("\n\nData Festiva - Desconto: " + Produto.desconto);
		
		precoFinal1 = p1.precoComDesconto();
		precoFinal2 = p2.precoComDesconto();
		
		System.out.printf("Média do Carrinho: R$%.2f", (precoFinal1 + precoFinal2) / 2);
	}
}
