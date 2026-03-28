package colecoes;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {

		HashSet<Usuario> usuarios = new HashSet<Usuario>();

		usuarios.add(new Usuario("Pedro"));
		usuarios.add(new Usuario("Ana"));
		usuarios.add(new Usuario("Guilherme"));

		System.out.println(usuarios.contains(new Usuario("Guilherme")));
		System.out.println(new Usuario("Guilherme"));
		
		Usuario user1 = new Usuario("Ana");
		System.out.println(user1.equals(new Usuario("Ana")));
	}
}
