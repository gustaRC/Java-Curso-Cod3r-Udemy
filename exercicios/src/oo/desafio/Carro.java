package oo.desafio;

public class Carro {

	final int VELOCIDADE_MAXIMA;
	int velocidadeAtual = 0;
	int delta = 5;

	public Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	void acelerar() {
		if ((velocidadeAtual + delta) > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += delta;
		}
	}

	void freiar() {
		if ((velocidadeAtual - 5) < 0) {
			velocidadeAtual = 0;
		} else {
			velocidadeAtual -= 5;
		}
	}

	public String toString() {
		return "Velocidade atual: " + velocidadeAtual;
	}
}
