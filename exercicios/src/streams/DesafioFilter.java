package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {

		Developer dev1 = new Developer("Gustavo", 13, 3, 15, 5);
		Developer dev2 = new Developer("Addler", 8, 2, 10, 17);
		Developer dev3 = new Developer("Emanuel", 12, 15, 12, 8);
		Developer dev4 = new Developer("Axel", 6, 7, 5, 42);

		List<Developer> devs = Arrays.asList(dev1, dev2, dev3, dev4);

		Predicate<Developer> maisErrosQueEnvios = dev -> dev.getErrosNoTeste() > dev.getEnviadasParaTeste();

		Predicate<Developer> maisDesenvolvidasQueEnvios = dev -> dev.getTarefasDesenvolvidas() > dev
				.getEnviadasParaTeste();

		Function<Developer, String> nomeMediaTarefasDesenvolvidas = dev -> dev.getNome()
				+ " | Média Desenvolvidas/EmTestes: " + 
				(dev.getTarefasDesenvolvidas() / dev.getEnviadasParaTeste());

		devs.stream()
			.filter(maisErrosQueEnvios)
			.filter(maisDesenvolvidasQueEnvios)
			.map(nomeMediaTarefasDesenvolvidas)
			.forEach(Utilitarios.println);
	}
}
