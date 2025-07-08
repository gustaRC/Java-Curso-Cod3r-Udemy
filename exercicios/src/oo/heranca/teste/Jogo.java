package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Jogador;
import oo.heranca.Monstro;

public class Jogo {

	public static void main(String[] args) {

		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 11;

		Jogador heroi = new Heroi(10, 10);

//		System.out.println("X (Leste/Oeste): " + j1.x);
//		System.out.println("Y (Norte/Sul): " + j1.y);
		System.out.println("Vida J1: " + monstro.vida);
		System.out.println("Vida J2: " + heroi.vida);

		monstro.atacar(heroi);

		System.out.println("Vida J1: " + monstro.vida);
		System.out.println("Vida J2: " + heroi.vida);

		heroi.andar(Direcao.SUL);
		monstro.atacar(heroi);

		System.out.println("Vida J1: " + monstro.vida);
		System.out.println("Vida J2: " + heroi.vida);
	}
}
