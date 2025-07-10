package oo.abstrato;

public class Cachorro extends Mamifero {

	@Override
	public String mover() {
		return "Utiliza as patas";
	}
	
	@Override
	public String mamar() {
		return "Usando leite";
	}
	
	public String comer() {
		return "Comeu ração";
	}
}
