package oo.heranca;

public class Jogador {

	public int vida = 100;
	public int x;
	public int y;

	Jogador(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public boolean atacar(Jogador oponente) {
		int deltaX = Math.abs(x - oponente.x); // valores absolutos, -1 se transforma em 1
		int deltaY = Math.abs(y - oponente.y);

		if (deltaX == 0 && deltaY == 1) {
			oponente.vida -= 10;
			return true;
		} else if (deltaX == 1 && deltaY == 0) {
			oponente.vida -= 10;
			return true;
		} else {
			return false;
		}
	}

	public boolean andar(Direcao direcao) {
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
