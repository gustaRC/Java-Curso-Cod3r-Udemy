package streams;

import java.util.Arrays;
import java.util.List;

public class OutrosMetodos {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Lucas", 6.2); // reprovado
		Aluno a3 = new Aluno("Fabricio", 8.9);
		Aluno a4 = new Aluno("Luiza", 9.3);
		Aluno a5 = new Aluno("Ana", 7.1); // repetido
		Aluno a6 = new Aluno("Lucas", 6.2); // repetido 
		Aluno a7 = new Aluno("Fabricio", 8.9); // repetido
		Aluno a8 = new Aluno("Luiza", 9.3); // repetido

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);

		System.out.println("Distinct...");
// 		funcionará corretamente com a implementação do equal e hashcode na classe Aluno
		alunos.stream()
			.distinct()
			.forEach(System.out::println);
		
		System.out.println("\nSkip/Limit");
//		uma forma de paginação nos resultados (pagina 1 com 10 itens)
		alunos.stream()
			.distinct()
			.skip(1) // pulou 1 item
			.limit(2) // limitou para extrair somente 2 itens
			.forEach(System.out::println);
		
		System.out.println("\nTakeWhile");
//		traz itens conforme uma condicional
		alunos.stream()
			.distinct()
			.takeWhile(a -> a.nota >= 7) // retornará somente itens com nota maior igual a 7
			.forEach(System.out::println);
	}
}
