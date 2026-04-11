package padroes.observer;


public class Namorada implements ChegadaAniversarioObservador {
//	observador/observer -> quem reage

	@Override
	public void chegou(EventoChegadaAniversariante event) { // ação para quando o evento for ativado
		System.out.println("Avisar os convidados...");
		System.out.println("Apagar as luzes...");
		System.out.println("Esperar um pouco...");
		System.out.println("E... Surpresa!!!");
	}
}
