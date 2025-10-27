package excecao;

public class Basico {

	public static void main(String[] args) {

		Aluno a1 = null;
		
		try {
			imprimirNomeDoAluno(a1);
		} catch (Exception e) {
			System.err.println("Erro causado na impressão do nome do aluno.");
		}

		try {
			System.out.println(7 / 0); // error
		} catch (Exception e) {
			System.err.println("Erro causado: " + e.getMessage());
		}

//		Necessário resolver o erro para continuar a leitura do código
		System.out.println("Fim :)");
	}

//	Método VULNERAVEL - caso o parametro seja nulo ocasionará um erro
	public static void imprimirNomeDoAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
}
