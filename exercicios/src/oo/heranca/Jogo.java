package oo.heranca;

public class Jogo {

	public static void main(String[] args) {

		Jogador j1 = new Jogador();
		j1.x = 10;
		j1.y = 10;
		
		j1.andar(Direcao.NORTE);
		j1.andar(Direcao.SUL);
		j1.andar(Direcao.SUL);
		j1.andar(Direcao.LESTE);
		j1.andar(Direcao.LESTE);
		j1.andar(Direcao.LESTE);
		
		System.out.println("X (Leste/Oeste): " + j1.x);
		System.out.println("Y (Norte/Sul): " + j1.y);
	}
}
