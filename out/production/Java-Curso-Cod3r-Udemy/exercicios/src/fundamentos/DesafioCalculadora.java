package fundamentos;

import javax.swing.JOptionPane;

public class DesafioCalculadora {

	public static void main(String[] args) {

		double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
		double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
		String operador = JOptionPane.showInputDialog("Digite a operação desejada(+, -, *, /, %):");

		double resultado = operador.equals("+") ? (valor1 + valor2)
				: (operador.equals("-") ? (valor1 - valor2)
						: (operador.equals("*") ? (valor1 * valor2) 
								: (operador.equals("/") ? (valor1 / valor2) : (valor1 % valor2) )));

		System.out.printf("Operação: %.3f %s %.3f = %.3f",
				valor1, operador, valor2, resultado);
	}
}
