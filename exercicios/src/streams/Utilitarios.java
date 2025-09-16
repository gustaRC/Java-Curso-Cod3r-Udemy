package streams;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public interface Utilitarios {

//	private Utilitarios() {
////		Não há a necessidade de instanciar esta classe já que suas funcionalidades são statics
//	}

	public final static Consumer<Object> print = System.out::print;
	public final static Consumer<Object> println = System.out::println;
	
	public final static UnaryOperator<String> maiuscula = n -> n.toUpperCase();
	public final static UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";

	public static String grito(String n) {
		return n + "!!! ";
	}
}
