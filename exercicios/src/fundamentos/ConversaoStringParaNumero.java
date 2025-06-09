package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringParaNumero {

	public static void main(String[] args) {

		// ao inves de escrevermos no console igual ao Scanner, escreveremos em um modal
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número:");

		String valor2 = JOptionPane.showInputDialog("Digite o segundo número:");

		System.out.println(valor1 + valor2); // será concatenado por ser 2 strings

		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);

		double soma = numero1 + numero2;
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + soma / 2);

		// BigDecimal - biblioteca para precisão de decimais
	}
}
