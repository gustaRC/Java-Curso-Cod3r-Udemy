package br.com.beltsistemas.cm.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.beltsistemas.cm.excecao.ExplocaoException;

class CampoTeste {

	private Campo campo;
	
	@BeforeEach // para cada um dos métodos teste será executado o 'inicarCampo()'
	void iniciarCampo() {
		campo = new Campo(3, 3);
	}

	@Test
	void testeVizinhoDistancia1() {
		Campo vizinho = new Campo(3, 2);
		boolean resultado = campo.adicionarVizinho(vizinho);

		assertTrue(resultado);
	}

	@Test
	void testeVizinhoDistancia2() {
		Campo vizinho = new Campo(2, 4);
		boolean resultado = campo.adicionarVizinho(vizinho);

		assertTrue(resultado);
	}

	@Test
	void testeNaoVizinho() {
		Campo vizinho = new Campo(1, 1);
		boolean resultado = campo.adicionarVizinho(vizinho);

		assertFalse(resultado);
	}

	@Test
	void testeVizinhancaSegura() {
		campo.adicionarVizinho(new Campo(1, 1));
		campo.adicionarVizinho(new Campo(1, 2));
		campo.adicionarVizinho(new Campo(2, 1));
		campo.vizinhancaSegura();
	}

	@Test
	void testeValorPadraoAtributoMarcado() {
		assertFalse(campo.isMarcado());
	}

	@Test
	void testeAlternarMarcacao() {
		campo.alternarMarcacao();
		assertTrue(campo.isMarcado());
	}

	@Test
	void testeAlternarMarcacaoDuasChamadas() {
		campo.alternarMarcacao();
		campo.alternarMarcacao();
		assertFalse(campo.isMarcado());
	}

	@Test
	void testeAbrirNaoMinadoNaoMarcado() {
		assertTrue(campo.abrir());
	}

	@Test
	void testeAbrirNaoMinadoMarcado() {
		campo.alternarMarcacao();
		assertFalse(campo.abrir());
	}

	@Test
	void testeAbrirMinadoMarcado() {
		campo.alternarMarcacao();
		campo.minar();
		assertFalse(campo.abrir());
	}

	@Test
	void testeAbrirMinadoNaoMarcado() {
		campo.minar();

		assertThrows(ExplocaoException.class, () -> {
			campo.abrir();
		});
	}

	@Test
	void testeAbrirComVizinho() {
		Campo vizinhoDoVizinho1 = new Campo(1, 1);

		Campo vizinho1 = new Campo(2, 2);
		vizinho1.adicionarVizinho(vizinhoDoVizinho1);

		campo.adicionarVizinho(vizinho1);
		campo.abrir();

		assertTrue(vizinho1.isAberto() && vizinhoDoVizinho1.isAberto());
	}

	@Test
	void testeAbrirComVizinho2() {
		Campo vizinhoDoVizinho1 = new Campo(1, 1);
		Campo vizinho1DoVizinho1 = new Campo(1, 1);
		vizinho1DoVizinho1.minar();

		Campo vizinho1 = new Campo(2, 2);
		vizinho1.adicionarVizinho(vizinhoDoVizinho1);
		vizinho1.adicionarVizinho(vizinho1DoVizinho1);

		campo.adicionarVizinho(vizinho1);
		campo.abrir();

		assertTrue(vizinho1.isAberto() && vizinhoDoVizinho1.isFechado());
	}

	@Test
	void testeGetLinha() {
		int linha = campo.getLinha();
		assertTrue(linha == 3);
	}

	@Test
	void testeGetColuna() {
		int coluna = campo.getColuna();
		assertTrue(coluna == 3);
	}

	@Test
	void testeObjetivoAlcancadoDesvendado() {
		campo.abrir();
		assertTrue(campo.objetivoAlcancado());
	}

	@Test
	void testeObjetivoAlcancadoProtegido() {
		campo.minar();
		campo.alternarMarcacao();
		assertTrue(campo.objetivoAlcancado());
	}

	@Test
	void testeMinasNaVizinhanca() {
		Campo campoMinado1 = new Campo(3, 4);
		campoMinado1.minar();
		Campo campoMinado2 = new Campo(4, 4);
		campoMinado2.minar();

		campo.adicionarVizinho(campoMinado1);
		campo.adicionarVizinho(campoMinado2);

		assertTrue(campo.minasNaVizinhanca() == 2);
	}

	@Test
	void testeReiniciar() {
		campo.abrir();
		campo.minar();
		campo.alternarMarcacao();

		campo.reiniciar();

		assertFalse(campo.isAberto() && campo.isMinado() && campo.isMarcado());
	}
	
	@Test
	void testeToStringMarcado() {
		campo.alternarMarcacao();
		
		assertTrue(campo.toString().equals("x"));
	}
	
	@Test
	void testeToStringAbertoMinado() {
		campo.abrir();
		campo.minar();
		
		assertTrue(campo.toString().equals("*"));
	}
	
	@Test
	void testeToStringAbertoComMinasNaVizinhanca() {
		Campo campoMinado = new Campo(4, 4);
		campoMinado.minar();
		
		campo.adicionarVizinho(campoMinado);
		
		campo.abrir();
		
		System.out.println(campo.toString());
		
		assertTrue(campo.toString().equals("1"));
	}
	
	@Test
	void testeToStringAberto() {	
		campo.abrir();
		
		assertTrue(campo.toString().equals(" "));
	}
	
	@Test
	void testeToString() {			
		assertTrue(campo.toString().equals("?"));
	}
	
}
