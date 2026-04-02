package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Ana", 6.2); // reprovado
		Aluno a3 = new Aluno("Ana", 8.9);
		Aluno a4 = new Aluno("Ana", 9.3);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Predicate<Aluno> reprovado = aprovado.negate();
		
		System.out.println(
					alunos.stream().allMatch(aprovado) // todo mundo foi aprovado?
				);
		
		System.out.println(
					alunos.stream().anyMatch(aprovado) // alguem foi aprovado?
				);
		
		System.out.println(
					alunos.stream().noneMatch(aprovado) // ninguém foi aprovado?
				); //~~ false, pois teve sim aprovações
		
		System.out.println(
					alunos.stream().noneMatch(reprovado) // ninguém foi reprovado?
				); //~~ false, pois teve sim reprovações
	}
}
