package excecao;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) {

		try {
			geraErro1(); // exceção NÃO tratada - NÃO obrigatorio seu tratamento (try/catch) pelo compilador
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}

//		se torna obrigatorio o tratamento
		try {
			geraErro2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Fim :)");
	}

//	Exceçao NÃO checada ou NÃO verificada.
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro! #01");
//		throw somente funciona com heranças da classe Throwable
//		ao utilizar o throw estamos interrompendo o fluxo da aplicação
	}

//	Exceçao checada ou verificada.
//	O 'throws Exception' é como se estivessemos 
//	dizendo que este método não se responsabiliza tratamento do erro.
//	Obrigando assim seu tratamento no método que o engloba
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro! #02");
	}

}
