package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		HashSet conjunto = new HashSet();

		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste");
		conjunto.add(1); // int -> Integer
		conjunto.add('x'); // char -> Character

		System.out.println(conjunto);

		System.out.printf("Possuimos %d elementos!\n", conjunto.size());

		conjunto.add("teste");
		System.out.printf("Possuimos %d elementos!\n", conjunto.size());

		conjunto.add("Teste"); // não será adicionado. Elemento repetido
		System.out.printf("Possuimos %d elementos!\n", conjunto.size());

		conjunto.remove('x');
		conjunto.remove(true);
		System.out.printf("Possuimos %d elementos!\n", conjunto.size());

		System.out.println("Possui 1.2? " + conjunto.contains(1.2));
		System.out.println("Possui \"Teste\"? " + conjunto.contains("Teste"));

		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);

		System.out.println(nums);

		conjunto.addAll(nums); // União entre dois conjuntos
		System.out.println(conjunto);

		conjunto.retainAll(nums); // Interseção, o que tem em um e no outro
		System.out.println(conjunto);
	}
}
