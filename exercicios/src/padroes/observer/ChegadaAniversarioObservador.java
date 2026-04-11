package padroes.observer;

// observer/observador
// interface para implementação de uma função padrão (chegou)
@FunctionalInterface
public interface ChegadaAniversarioObservador {

	public void chegou(EventoChegadaAniversariante event); // abstract
}
