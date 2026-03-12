package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
	
	public static void main(String[] args) {
		
		List<String> langs = Arrays.asList("JS", "PHP", "Java", "C++");
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
		
		String ultimaLinguagem = (String) ListaUtil.getUltimo(langs);
		System.out.println(ultimaLinguagem);
		
		Integer ultimoNumero = (Integer) ListaUtil.getUltimo(nums);
		System.out.println(ultimoNumero);
		
		
		String ultimaLinguagem2 = ListaUtil.getUltimoGenerics(langs);
		System.out.println(ultimaLinguagem2);
		
//		ERRO -> Estamos inferindo explicitamente que o retorno vai ser <Integer>
//		Double ultimoNumero2 = ListaUtil.<Integer>getUltimoGenerics(nums);
		Integer ultimoNumero2 = ListaUtil.<Integer>getUltimoGenerics(nums);
		System.out.println(ultimoNumero2);
		
		ListaUtil.<Integer, Double, String>multiGenerics(null, null);
	}
}
