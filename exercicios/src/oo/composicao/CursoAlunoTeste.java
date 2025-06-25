package oo.composicao;

public class CursoAlunoTeste {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Maria");

		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("HTML, CSS e JS");
		Curso curso3 = new Curso("Angular");

		aluno2.adicionarCurso(curso3);
		aluno1.adicionarCursos(new Curso[] { curso1, curso2, curso3 });

		System.out.println("Cursos matriculados: ");
		for (Curso curso : aluno1.cursos) {
			System.out.print(curso.nome + " | ");
		}

		Curso cursoObtido = aluno2.obterCursoMatriculado("Angular");

		System.out.printf("\nAlunos matriculados no curso %s: ", cursoObtido.nome);
		for (Aluno aluno : cursoObtido.alunos) {
			System.out.print(aluno.nome + " | ");
		}
	}
}
