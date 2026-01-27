package br.com.beltsistemas.cm.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TabuleiroTeste {

	private Campo campo;
	
	@BeforeEach // para cada um dos métodos teste será executado o 'inicarCampo()'
	void iniciarCampo() {
		campo = new Campo(3, 3);
	}
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
