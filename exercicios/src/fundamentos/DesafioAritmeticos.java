package fundamentos;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		// Calculo Esquerda
		int numSupEsq = 6 * (3 + 2);
		double potenciaSupEsq = Math.pow(numSupEsq, 2);

		int numInfEsq = 3 * 2;

		int resolucaoEsq = (int) potenciaSupEsq / numInfEsq;
		System.out.println("Resolução calculo esquerda: " + resolucaoEsq);

		// Calculo Direita
		int numSupDir = (1 - 5) * (2 - 7);
		int resolucaoDir = (int) Math.pow(numSupDir / 2, 2);
		System.out.println("Resolução calculo direita: " + resolucaoDir);

		// Calculo escopo Global
		int resolucaoGlobal = (int) Math.pow(resolucaoEsq - resolucaoDir, 3);
		int divisorGlobal = (int) Math.pow(10, 3);

		int resultado = resolucaoGlobal / divisorGlobal;
		
		System.out.println("Resultado: " + resultado);
	}
}
