package oo.abstrato;

public abstract class Mamifero extends Animal {

	public abstract String mamar();

	public final String parir() { // método não poderá ser alterado (final)
		return "Nasceu um bebê";
	}
}
