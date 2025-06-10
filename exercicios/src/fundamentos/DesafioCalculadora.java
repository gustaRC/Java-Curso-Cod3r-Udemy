package fundamentos;

import javax.swing.JOptionPane;

public class DesafioCalculadora {

	public static void main(String[] args) {

		double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
		double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
		String operador = JOptionPane.showInputDialog("Digite a operação desejada(+, -, *, /, %):");
		
		double calculoSoma = valor1 + valor2;
		double calculoSub = valor1 - valor2;
		double calculoMult = valor1 * valor2;
		double calculoDiv = valor1 / valor2;
		double calculoMod = valor1 % valor2;
		
		System.out.println(operador);
		
//		double resultado = operador.equals("+") ? calculoSoma : ; 
		
	}
}
