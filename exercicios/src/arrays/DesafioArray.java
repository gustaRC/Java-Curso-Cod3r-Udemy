package arrays;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class DesafioArray {

	public static void main(String[] args) {

		int qtdeNotas = Integer.parseInt(JOptionPane.showInputDialog(
				"--- Iniciando Aplicação de Calcular a média do Aluno --- \nQuantas notas serão calculadas"));

		double[] notas = new double[qtdeNotas];

		for (int i = 0; i < qtdeNotas; i++) {
			notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota " + (i + 1) + " (0 <> 10):"));

			if (notas[i] > 10 || notas[i] < 0) {
				JOptionPane.showMessageDialog(null, "Nota inválida! Digite um número entre 0 e 10!");
				i--;
			}
		}

		double total = 0;

		for (double nota : notas) {
			total += nota;
		}

		System.out.println("Notas do Aluno: " + Arrays.toString(notas) + ";");

		double media = total / qtdeNotas;
		System.out.printf("- Média: %.1f.", media);
	}
}
