package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 7.8;
		String resultadoParcial = media >= 5 ? "esta de recuperação" : "reprovou";
		String resultadoFinal = media >= 7 ? "passou" : resultadoParcial;
		System.out.printf("Cleitin %s", resultadoFinal);
	}
}
