package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Map {
	
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");
		
		marcas.stream().map(m -> m.toLowerCase()).forEach(print);
		
		System.out.println("\n\nUsando Composição:");
		marcas.stream()
			.map(Utilitarios.maiuscula) //unary operator
			.map(Utilitarios.primeiraLetra) //unary operator
			.map(Utilitarios::grito) //method reference
			.forEach(print);		
	}
}
