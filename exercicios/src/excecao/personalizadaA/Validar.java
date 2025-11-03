package excecao.personalizadaA;

import excecao.Aluno;

public abstract class Validar {

	public static void aluno(Aluno aluno) {
		if (aluno == null) {
			throw new IllegalArgumentException();
		}

		if (aluno.nome == null || aluno.nome.trim().isEmpty()) {
			throw new StringVaziaException("nome");
		}

		if (aluno.nota < 0 || aluno.nota > 10) {
			throw new NumeroForaIntervaloException("nota");
		}
	}
}
