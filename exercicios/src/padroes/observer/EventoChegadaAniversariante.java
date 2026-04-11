package padroes.observer;

import java.util.Date;

//  classe para registar data/hora
public class EventoChegadaAniversariante {

	private final Date momento;

	public EventoChegadaAniversariante(Date momento) {
		super();
		this.momento = momento;
	}

//	função não é usada
	public Date getMomento() {
		return momento;
	}
}
