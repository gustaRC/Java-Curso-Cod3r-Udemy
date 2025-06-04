package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {
		
		//VARIAVEL: tipoVariavel nomeVariavel = valorVariavel;
		double raio = 3.4;
		
		//CONSTANTE: final tipoVariavel nomeVariavel = valorVariavel;
		final double PI = 3.14; //Nome de contante TOTALMENTE MAIÚSCULO 
		
		double area = PI * raio * raio;
		System.out.println("Primeira Área: " + area + "m2");
		
		//Não declaramos novamente o tipo da variavel, somente atribuimos valor!
		raio = 10;
		
		area = PI * raio * raio;
		System.out.println("Segunda Área: " + area + "m2");
	}	
}