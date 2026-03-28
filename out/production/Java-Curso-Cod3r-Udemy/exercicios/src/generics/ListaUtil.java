package generics;

import java.util.List;

public class ListaUtil {

// static está atrelado a classe, podemos usar o método sem instanciar a classe
	public static Object getUltimo(List<? extends Object> lista) {
		return lista.get(lista.size() - 1);
	}
	
	public static <T> T getUltimoGenerics(List<T> lista) {
		return lista.get(lista.size() - 1);
	}
	
	public static <T extends Number> T getUltimoGenericsNumber(List<T> lista) {
		return lista.get(lista.size() - 1);
	}
	
	public static <A, B, C> C multiGenerics(A paramA, B paramB) {
		C teste = null;
		return teste;
	}
}
