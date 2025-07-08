package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {

		Pessoa convidado = new Pessoa(99.80);

		Arroz ingrediente1 = new Arroz(0.250);
		Feijao ingrediente2 = new Feijao(0.180);
		Sorvete ingrediente3 = new Sorvete(0.100);

		System.out.println(convidado.getPeso());

		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);
		convidado.comer(ingrediente3);

		System.out.println(convidado.getPeso());
	}
}
