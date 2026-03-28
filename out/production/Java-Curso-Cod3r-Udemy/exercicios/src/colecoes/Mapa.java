package colecoes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {

		Map<Integer, String> usuarios = new HashMap<Integer, String>();

		usuarios.put(1, "Roberto");
		usuarios.put(1, "Ricardo"); // não somente adiciona como altera caso a chave já exista
		usuarios.put(20, "Rafaela");
		usuarios.put(3, "Rebeca");
		usuarios.put(6, "Manoela");

		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());

		System.out.println(usuarios.keySet()); // retornar todos as chaves/keys
		System.out.println(usuarios.values()); // retornar todos os valores/values
		System.out.println(usuarios.entrySet()); // retornar valores e chaves

		System.out.println(usuarios.containsKey(20));
		System.out.println(usuarios.containsValue("Manoela"));

		System.out.println(usuarios.get(20));

		for (int chave : usuarios.keySet()) {
			System.out.println(chave);
		}

		for (String valor : usuarios.values()) {
			System.out.println(valor);
		}

		for (Entry<Integer, String> registro : usuarios.entrySet()) {
			System.out.println(registro.getKey() + " - " + registro.getValue());
		}

		System.out.println(usuarios.remove(1));
		System.out.println(usuarios.remove(4, "Gui")); // não removerá pois não existe e retornará false
	}
}
