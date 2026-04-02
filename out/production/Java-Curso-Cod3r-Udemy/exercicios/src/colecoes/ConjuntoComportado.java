package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {

		Set<String> lista = new HashSet<String>();
		SortedSet<String> listaOrdenada = new TreeSet<String>(); // set ordenado

		lista.add("Carlos");
		lista.add("Ana");
		lista.add("Pedro");
		lista.add("Kiko");

		listaOrdenada.add("Iai");
		listaOrdenada.add("Opa");
		listaOrdenada.add("Fechou");

		System.out.println(lista);
		System.out.println(listaOrdenada); // ordenado em ordem alfabetica
	}
}
