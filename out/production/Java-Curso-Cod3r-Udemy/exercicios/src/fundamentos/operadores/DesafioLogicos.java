package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		
		boolean TV50pol = trabalho1 && trabalho2;
		boolean TV32pol = trabalho1 ^ trabalho2;
		
		boolean irAoShoppingTomarSorvete = trabalho1 || trabalho2;
		boolean familiaMaisSaudavel = !irAoShoppingTomarSorvete;
		
		System.out.printf("O primeiro trabalho deu certo? %b\n", trabalho1);
		System.out.printf("O segundo trabalho deu certo? %b\n", trabalho2);
		
		System.out.printf("\nComprou a TV de 50 polegadas? %b\n", TV50pol);
		System.out.printf("Comprou a TV de 32 polegadas? %b\n", TV32pol);
		
		System.out.printf("\nA familia foi ao shopping tomar sorvete? %b\n", irAoShoppingTomarSorvete);
		System.out.printf("A familia está saudável? %b\n", familiaMaisSaudavel);
	}
}
