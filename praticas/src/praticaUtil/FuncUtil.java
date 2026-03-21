package praticaUtil;

import java.util.Collection;

public class FuncUtil {

	public static void imprimirTodosItensDaLista(Collection<?> lista) {
		lista.forEach(System.out::println);
	}
}
