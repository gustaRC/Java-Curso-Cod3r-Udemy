package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
	
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Lucas", 6.2); // reprovado
		Aluno a3 = new Aluno("Fabricio", 8.9);
		Aluno a4 = new Aluno("Luiza", 9.3);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
//		interface de comparação de valores
		Comparator<Aluno> melhorNota = (al1, al2) -> {
			if (al1.nota > al2.nota) return 1;
			if (al1.nota < al2.nota) return -1;
			return 0;
		};
		
		Comparator<Aluno> piorNota = (al1, al2) -> {
			if (al1.nota > al2.nota) return -1;
			if (al1.nota < al2.nota) return 1;
			return 0;
		};

		System.out.println(alunos.stream().max(melhorNota).get());
		System.out.println(alunos.stream().min(melhorNota).get());
		
		System.out.println(alunos.stream().min(piorNota).get());
		System.out.println(alunos.stream().max(piorNota).get());
	}
}
