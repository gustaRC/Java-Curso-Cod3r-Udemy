package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {

		Consumer<String> print = System.out::print;
		Consumer<Integer> println = System.out::println;

//		Forma 1
		Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
		langs.forEach(print);

//		Forma 2
		String[] maisLangs = { "Python ", "Lisp ", "Pearl ", "Go\n" };
		Stream.of(maisLangs).forEach(print);

//		Forma 3
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 1, 3).forEach(print); // define pelo indice

//		Forma 4
		List<String> outrasLangs = Arrays.asList("\nC ", "PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);
		
//		Forma 5 - geração infinita sem ordenação
//		Stream.generate(() -> "a").forEach(print);

//		Forma 6 - geração infinita com ordenação
		Stream.iterate(0, n -> n + 1).forEach(println);
		
//		Foreach é uma operação terminaria, pois ela não retorna nada!
	}
}
