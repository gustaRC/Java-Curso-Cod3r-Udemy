package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {

	boolean ligarTurbo;
	boolean ligarAr;

	public Ferrari() {
		super(400);
		setDelta(15);
	}

	@Override
	public void ligarTurbo() { // implementação obrigatoria devido a interface
		ligarTurbo = true;
	}

	@Override
	public void desligarTurbo() { // implementação obrigatoria devido a interface
		ligarTurbo = false;
	}

	@Override
	public void ligarAr() { // implementação obrigatoria devido a interface
		ligarAr = true;
	}

	@Override
	public void desligarAr() { // implementação obrigatoria devido a interface
		ligarAr = false;
	}

	@Override
	public int getDelta() {
		if (ligarTurbo && ligarAr) {
			return 35;
		} else if (ligarTurbo && !ligarAr) {
			return 30;
		} else if (!ligarTurbo && !ligarAr) {
			return 20;
		} else {
			return 15;
		}
	}
}
