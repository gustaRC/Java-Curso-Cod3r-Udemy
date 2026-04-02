package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();

		fila.add("Ana"); // lançará uma exceção/erro caso a fila esteja cheia.
		fila.add("Gui");
		fila.offer("Bia"); // retorna falso caso a fila esteja cheia.
		fila.offer("Daniel");

		// trazer o próximo da fila (sem remover)
		System.out.println(fila.peek()); // retorna null caso não encontre nada
		System.out.println(fila.element()); // lança uma exceção/erro caso não encontre nada

		System.out.println(fila.size()); // tamanho
		System.out.println(fila.isEmpty()); // está vazio?
		System.out.println(fila.contains("Bia"));

		// trazer o próximo da fila (removendo-o)
		System.out.println(fila.poll()); // retorna null caso não encontre nada
		System.out.println(fila.remove()); // lança uma exceção/erro caso não encontre nada

		fila.clear();
	}
}
