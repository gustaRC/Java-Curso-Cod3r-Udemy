package controle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {

		int numero = Integer.parseInt(
				JOptionPane.showInputDialog("Informe o número"));

		if (numero % 2 == 0) {
			System.out.println("Número par!");
		} else {
			System.out.println("Número impar!");
		}
	}
}
