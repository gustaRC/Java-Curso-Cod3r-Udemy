package excecao.personalizadaB;

import excecao.Aluno;

public class TesteValidacoes {

	public static void main(String[] args) {

		//	Validar.aluno(aluno); ocorre erro, pois agora é obrigatorio o tratamento!
		
		try {
			Aluno aluno = new Aluno("Ana", -7);
			Validar.aluno(aluno); // agora se torna obrigatorio o tratamento!
		} catch (StringVaziaException e) { // tratamento de uma classe especifica
			System.out.println(e.getMessage());
		} catch (NumeroForaIntervaloException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Fim :)");
	}
}
