package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Quantos alunos? ");
		int qtdeAlunos = scanner.nextInt();

		System.out.print("Quantas notas por aluno? ");
		int qtdeNotas = scanner.nextInt();

		double[][] notasDaTurma = new double[qtdeAlunos][qtdeNotas]; // matriz
		double total = 0;
		
		for (int i_aluno = 0; i_aluno < notasDaTurma.length; i_aluno++) {
			System.out.println("-- Aluno " + (i_aluno + 1) + " --");
			
			for (int j_nota = 0; j_nota < notasDaTurma[i_aluno].length; j_nota++) {

				System.out.printf("Informe a nota %d do aluno %d: \n", (j_nota + 1), (i_aluno + 1));

				notasDaTurma[i_aluno][j_nota] = scanner.nextDouble();
				total += notasDaTurma[i_aluno][j_nota];
			}
		}

		System.out.println("Notas: ");
		for(double[] notasAluno : notasDaTurma) {
			System.out.println(Arrays.toString(notasAluno));			
		}
		
		double media = total / (qtdeAlunos * qtdeNotas);
		System.out.printf("\nA média geral é: %.1f", media);
		
		scanner.close();
	}
}
