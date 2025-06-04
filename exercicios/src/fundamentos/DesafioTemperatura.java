package fundamentos;

/*
 * Referente a aula "Desafio Variáveis e Constantes"
 * - FORMULA: (VALOR_F - 32) x 5/9 = VALOR_CELSIUS
 * */
public class DesafioTemperatura {

	public static void main(String[] args) {
		
		final int AJUSTE = 32;
		final double FATOR = 5 / 9.0;
		
		double valor_f = 90;
		
		double valor_c = (valor_f - AJUSTE) * FATOR;
		
		System.out.println("Fahrenheit: " + valor_f + "; Celsius: " + valor_c);
	}
}
