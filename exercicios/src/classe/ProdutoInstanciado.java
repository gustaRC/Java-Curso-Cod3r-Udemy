package classe;

public class ProdutoInstanciado {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4490.90, 0.25);
		
		var p2 = new Produto();
		p2.nome = "Caneca Preta";
		p2.preco = 12.50;
		p2.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		
		System.out.printf("Média do Carrinho: R$%.2f", (precoFinal1 + precoFinal2) / 2);
	}
}
