package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {

		// Recebe um único parametro e retorna void
		Consumer<Produto> imprimirNome = prod -> System.out.println(prod.nome);

		Produto p1 = new Produto("Caneta Azul", 12.30, 0.09);
		imprimirNome.accept(p1);

		Produto p2 = new Produto("Caneta Branca", 12.30, 0.09);
		Produto p3 = new Produto("Caneta Preta", 12.30, 0.09);
		Produto p4 = new Produto("Caneta Vermelha", 12.30, 0.09);
		Produto p5 = new Produto("Caneta Amarela", 12.30, 0.09);

//		List === Interface
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

		produtos.forEach(imprimirNome);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println); // necessário configurar toString() para formatação na exibição

		
		List<String> variavelList = new ArrayList<String>();
		
		variavelList.addAll(Arrays.asList("nome1", "nome2"));
		variavelList = new LinkedList<String>(); // adiciona uma nova referencia na memória, perdendo dados antigos
		variavelList.forEach(System.out::println);

		variavelList.addAll(Arrays.asList("nome3", "nome4"));
		variavelList.forEach(System.out::println);

	}
}
