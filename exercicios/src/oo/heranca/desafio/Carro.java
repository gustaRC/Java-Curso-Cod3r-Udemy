package oo.heranca.desafio;

public class Carro {

	public final int VELOCIDADE_MAXIMA;
	protected int velocidadeAtual = 0;
	protected int delta = 5;

	public Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	public void acelerar() {
		if ((velocidadeAtual + delta) > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += delta;
		}
	}

	public void freiar() {
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
