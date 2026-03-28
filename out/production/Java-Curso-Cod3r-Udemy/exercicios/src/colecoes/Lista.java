package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {

		ArrayList<Usuario> lista = new ArrayList<Usuario>();

		Usuario u1 = new Usuario("Ana");

		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		lista.add(new Usuario("Manu"));

		System.out.println(lista.get(1).nome);

		lista.remove(1);
		lista.remove(new Usuario("Manu")); // por causa do hashcode e equals, torna seguro e correto esse método
		
		System.out.println("Tem? " + lista.contains(new Usuario("Lia")));
		
		System.out.println("For:");
		for (Usuario usuario : lista) {
			System.out.println(usuario.nome);
		}
	}
}
