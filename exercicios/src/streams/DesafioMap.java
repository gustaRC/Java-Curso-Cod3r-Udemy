package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		/*
		 * 1. Número para string binária... 6 => "110"
		 * 2. Inverter a string... "110" => "011"
		 * 3. Converter de volta para inteiro => "110" => 3
		*/
		
//		1.
		Function<Integer, String> intParaBinario = n -> Integer.toBinaryString(n);
		
//		2.
		UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();
		
		@SuppressWarnings("unused")
		UnaryOperator<String> inverter2 = s -> {
			String stringInvertida = "";
			
			for (int i = s.length() - 1 ; i >= 0; i-- ) {
				stringInvertida += s.toCharArray()[i];
			}
			
			return stringInvertida;
		};
		
//		3.
		Function<String, Integer> binarioParaInt = s -> Integer.parseInt(s, 2);
		
		System.out.println("\nPadrão");
		nums.stream()
			.forEach(Utilitarios.println);
		
		System.out.println("Manipulado");
		nums.stream()
			.map(intParaBinario)
			.map(inverter)
			.map(binarioParaInt)
			.forEach(Utilitarios.println);
	}
}
