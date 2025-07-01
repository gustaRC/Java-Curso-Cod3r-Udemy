package oo.heranca;

public class Jogo {

	public static void main(String[] args) {

		Monstro j1 = new Monstro();
		j1.x = 10;
		j1.y = 11;

		Jogador j2 = new Heroi();
		j2.x = 10;
		j2.y = 10;

//		System.out.println("X (Leste/Oeste): " + j1.x);
//		System.out.println("Y (Norte/Sul): " + j1.y);
		System.out.println("Vida J1: " + j1.vida);
		System.out.println("Vida J2: " + j2.vida);

		j1.atacar(j2);

		System.out.println("Vida J1: " + j1.vida);
		System.out.println("Vida J2: " + j2.vida);

		j2.andar(Direcao.SUL);
		j1.atacar(j2);

		System.out.println("Vida J1: " + j1.vida);
		System.out.println("Vida J2: " + j2.vida);
	}
}
