package oo.desafio;

public class Carro {

	int velocidadeAtual = 0;
	
	boolean acelerar() {
		velocidadeAtual += 5;
		return true;
	}
	
	boolean freiar() {
		if ((velocidadeAtual - 5) < 0) {
			velocidadeAtual = 0;
			return false;
		} else {
			velocidadeAtual -= 5;
			return true;
		}
	}
	
	public String toString() {
		return "Velocidade atual: " + velocidadeAtual;
	}
}
