package controle;

import javax.swing.JOptionPane;

public class DesafioDiaSemana {

	public static void main(String[] args) {

		String diaSemana = JOptionPane.showInputDialog("Digite algum dia da semana:")
				.toLowerCase();

		if (diaSemana.equals("domingo")) {
			System.out.println("Dia 1");
		} else if (diaSemana.equals("segunda")) {
			System.out.println("Dia 2");
		} else if (
			diaSemana.equals("terça") || 
			diaSemana.equals("terca")
		) {
			System.out.println("Dia 3");
		} else if (diaSemana.equals("quarta")) {
			System.out.println("Dia 4");
		} else if (diaSemana.equals("quinta")) {
			System.out.println("Dia 5");
		} else if (diaSemana.equals("sexta")) {
			System.out.println("Dia 6");
		} else if (
			diaSemana.equals("sábado") ||
			diaSemana.equals("sabado")
		) {
			System.out.println("Dia 7");
		} else {
			System.out.println("Dia inválido!");
		}
	}
}
