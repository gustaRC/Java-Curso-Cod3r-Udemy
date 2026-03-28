package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {

		double[] notasAlunoA = new double[3];
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.5;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		double total = 0;
		for(int i = 0; i < notasAlunoA.length; i++) {
			total += notasAlunoA[i];
		}
		
		System.out.printf("Média geral Aluno A: %.1f.\n", total / notasAlunoA.length);
		
		final double NOTA_ARMAZENADA = 10;
		double[] notasAlunoB = { 5.7, 8.1, NOTA_ARMAZENADA };
		
		total = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			total += notasAlunoB[i];
		}
		
		System.out.printf("Média geral Aluno B: %.1f.\n", total / notasAlunoB.length);
	}
}
