package padroes.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {
//  subject -> quem avisa

	private List<ChegadaAniversarioObservador> observadores = new ArrayList<>(); // armazena para quem avisará

	public void registrarObservador(ChegadaAniversarioObservador obs) {
		observadores.add(obs);
	} // adiciona a lista de armazenamento

	public void monitorar() { // motor da aplicação
		Scanner scanner = new Scanner(System.in);

		String valor = "";
		while (!"sair".equalsIgnoreCase(valor)) {
			System.out.print("Aniversariante chegou? ");
			valor = scanner.nextLine();

			if ("sim".equalsIgnoreCase(valor)) {
				// criar evento
				EventoChegadaAniversariante evento = new EventoChegadaAniversariante(new Date());

				// notificar observadores!!!
				observadores.stream().forEach(obs -> obs.chegou(evento));
				valor = "sair";
			} else {
				System.out.println("Alarme falso!");
			}
		}

		scanner.close();
	}
}

/*	PASSO A PASSO DE COMO APLICAR OS OBSERVADORES


* */
