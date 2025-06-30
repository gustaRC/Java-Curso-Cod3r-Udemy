package oo.heranca;

public class Jogador {

	int x;
	int y;

	boolean andar(Direcao direcao) {
		switch (direcao) {
		case Direcao.NORTE:
			y--;
			break;
		case Direcao.SUL:
			y++;
			break;
		case Direcao.OESTE:
			x--;
			break;
		case Direcao.LESTE:
			x++;
			break;
		default:
			return false;
		}

		return true;
	};
}
