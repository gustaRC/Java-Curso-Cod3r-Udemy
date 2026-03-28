package generics;

public class ParesTeste {

	public static void main(String[] args) {

		Pares<Integer, String> resultadoConcurso = new Pares<Integer, String>();

		resultadoConcurso.adicionar(1, "Teste1");
		resultadoConcurso.adicionar(2, "Teste2");
		resultadoConcurso.adicionar(3, "Teste3");
		resultadoConcurso.adicionar(2, "Teste4");

		System.out.println(resultadoConcurso.getValor(1));
		System.out.println(resultadoConcurso.getValor(2));
	}
}
