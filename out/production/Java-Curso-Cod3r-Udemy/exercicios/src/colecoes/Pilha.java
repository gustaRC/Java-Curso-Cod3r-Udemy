package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {

		Deque<String> livros = new ArrayDeque<String>();

		livros.add("O Pequeno Príncipe"); // retorna booleano
		livros.push("Don Quixote"); // retorna erro somente se a fila estiver cheia

		// trazer o ultimo que entro na pilha (sem remover)
		System.out.println(livros.peek()); // retorna null caso não encontre nada
		System.out.println(livros.element()); // lança uma exceção/erro caso não encontre nada

		// trazer o ultimo que entro na pilha (removendo-o)
		System.out.println(livros.poll()); // retorna null caso não encontre nada
		System.out.println(livros.pop()); // lança uma exceção/erro caso não encontre nada
		System.out.println(livros.remove()); // lança uma exceção/erro caso não encontre nada
	
		livros.size();
		livros.clear();
		livros.contains("O Hobbit");
		livros.isEmpty();
	}
}
