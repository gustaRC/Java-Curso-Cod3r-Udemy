package excecao.personalizadaA;

import excecao.Aluno;

public class TesteValidacoes {

	public static void main(String[] args) {

		try {
			Aluno aluno = new Aluno("Ana", -7);
			Validar.aluno(aluno);
		} catch (StringVaziaException e) { // tratamento de uma classe especifica
//			caso tivesse utilizado a classe pai RuntimeException, somente este catch seria o suficiente
			System.out.println(e.getMessage());
		} catch (NumeroForaIntervaloException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Fim :)");
	}
}
