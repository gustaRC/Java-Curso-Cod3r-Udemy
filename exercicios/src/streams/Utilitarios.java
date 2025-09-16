package streams;

import java.util.function.UnaryOperator;

public interface Utilitarios {

//	private Utilitarios() {
////		Não há a necessidade de instanciar esta classe já que suas funcionalidades são statics
//	}

	public final UnaryOperator<String> maiuscula = n -> n.toUpperCase();
	public final UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";

	public static String grito(String n) {
		return n + "!!! ";
	}
}
