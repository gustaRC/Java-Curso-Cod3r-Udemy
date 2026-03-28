package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Bia", 5.4);
		Aluno a3 = new Aluno("Pedro", 9.8);
		Aluno a4 = new Aluno("Rebeca", 7.1);
		Aluno a5 = new Aluno("Gui", 6.7);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		
		alunos.stream()
//			.filter(aluno -> aluno.nota >= 7)
			.filter(aprovado)
			.forEach(aluno -> System.out.println(
						"Parabéns! Aluno(a) " + 
						aluno.nome + 
						" foi aprovado(a) com a nota " + 
						aluno.nota + "!"
					));
	}
}
