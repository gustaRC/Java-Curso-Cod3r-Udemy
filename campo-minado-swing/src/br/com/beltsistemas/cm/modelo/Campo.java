package br.com.beltsistemas.cm.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class Campo {

	private final int linha;
	private final int coluna;

	private boolean aberto; // por padrão, o valor de boolean quando não atribuido é 'false'
	private boolean minado = false;
	private boolean marcado = false;

	private List<Campo> vizinhos = new ArrayList<Campo>();
//	para evitar duplicações podemos usar o Set, juntamente do LinkedHashSet para que ele respeite a ordem de inserção
	private List<CampoObservador> observadores = new ArrayList<CampoObservador>();
//	podemos usar a interface já criada: BIConsumer que tem o mesmo comportamento da interface CampoObservador
//	ou seja, tem um método que recebe 2 parametros e retorna void
//	private List<BiConsumer<Campo, CampoObservador>> observadores = new ArrayList<>();

	Campo(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}
	
	public void registrarObservador(CampoObservador observador) {
		observadores.add(observador);
	}
	
	private void notificarObservadores(CampoEvento evento) {
		observadores.stream().forEach(o -> o.eventoOcorreu(this, evento));
	}

	boolean adicionarVizinho(Campo vizinho) {
		boolean linhaDiferente = linha != vizinho.linha;
		boolean colunaDiferente = coluna != vizinho.coluna;
		boolean diagonal = linhaDiferente && colunaDiferente;

		int deltaLinha = Math.abs(linha - vizinho.linha);
		int deltaColuna = Math.abs(coluna - vizinho.coluna);
		int deltaGeral = deltaColuna + deltaLinha;

		if ((deltaGeral == 1 && !diagonal) || (deltaGeral == 2 && diagonal)) {
			vizinhos.add(vizinho);
			return true;
		} else {
			return false;
		}
	}

	void alternarMarcacao() {
		if (!aberto) {
			marcado = !marcado;
			
			if(marcado) {
				notificarObservadores(CampoEvento.MARCAR);
			} else {
				notificarObservadores(CampoEvento.DESMASCAR);				
			}
		}
	}

	boolean abrir() {
		if (!aberto && !marcado) {
			if (minado) {
				notificarObservadores(CampoEvento.EXPLODIR);
				return true;
				// 'todo' ou 'fixme' em maisculos, o Eclipse/IDE vai identificar como TASKS para serem feita.
				// ou seja, é somente ir na aba Tasks da IDE que vai estár essa informação
			}
			
			setAberto(true);

			if (vizinhancaSegura()) {
				vizinhos.forEach(v -> v.abrir());
			}

			return true;
		} else {
			return false;
		}
	}

	boolean vizinhancaSegura() {
		//System.out.println(vizinhos.stream().noneMatch(v -> v.minado));
		//se nenhum vizinho der um match no predicado (ou seja, se minado for true, logo se estiver minado) retornará 'true'
		//caso algum vizinho esteja minado, retornará 'false'
		return vizinhos.stream().noneMatch(v -> v.minado); //noneMatch === nenhum bateu, nenhum item atendeu os requisitos ? true : false
	}
	
	void minar() {
		minado = true;
	}
	
	public boolean isMinado() {
		return minado;
	}
	
	public boolean isMarcado() {
		return marcado;
	}
	
	
	void setAberto(boolean aberto) {
		this.aberto = aberto;
		
		if (aberto) {
			notificarObservadores(CampoEvento.ABRIR);			
		}
	}

	public boolean isAberto() {
		return aberto;
	}
	
	public boolean isFechado() {
		return !isAberto();
	}

	public int getLinha() {
		return linha;
	}

	public int getColuna() {
		return coluna;
	}
	
	boolean objetivoAlcancado() {
		boolean desvendado = !minado && aberto;
		boolean protegido = minado && marcado;
		return desvendado || protegido;
	}
	
	long minasNaVizinhanca() {
		return vizinhos.stream().filter(v -> v.minado).count();
	}
	
	void reiniciar() {
		aberto = false;
		minado = false;
		marcado = false;
	}	
}
