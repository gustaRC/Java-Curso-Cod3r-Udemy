package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		
		//Caractere no index desejado
		System.out.println("Olá mundo".charAt(2));
		
		//Concatenação
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		
		//Começa com? true/false
		System.out.println(s.startsWith("Boa"));
		
		//Formatação + Começa com?
		System.out.println(s.toLowerCase().startsWith("boa"));

		//Termina com?
		System.out.println(s.endsWith("dia"));
		
		//Tamanho da String
		System.out.println(s.length());
		
		//Verificação de Igualdade
		System.out.println(s.equals("boa tarde"));
		
		//Verificação de Igualdade ignorando a caixa do texto
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		//Descobrindo o index
		String exemplo = "Frase qualquer";
		System.out.println(exemplo.indexOf("qual")); //encontrou? return index; não_encontrou? return -1
		
		//Iniciando a partir de um index
		System.out.println(exemplo.substring(6));
		
		//Iniciando e terminando a partir de um index
		System.out.println(exemplo.substring(6, 10));
		
		//Juntando o "Descobrindo o index" com "Iniciando a partir de um index"
		System.out.println(exemplo.substring(exemplo.indexOf("qual")));
		
		var nome = "Gabriel";
		var sobrenome = "Rodrigues";
		var idade = 23;
		var salario = 12352.124;
		
		System.out.println("1- Nome: " + nome +
				"\nSobrenome: " + sobrenome +
				"\nIdade: " + idade +
				"\nSalario: " + salario + "\n");
			
		//Formatação
		/*
		 * s% = string
		 * %d = inteiro
		 * %f = float
		 * %.2f = float com 2 casas decimais
		 * */
		System.out.printf(
					"2- Nome: %s %s; \nIdade: %d; \nSalario: %.2f. \n\n", 
					nome, sobrenome, idade, salario
				);
		
		String frase = String.format(
						"3- Nome: %s %s; \nIdade: %d; \nSalario: %.2f.", 
						nome, sobrenome, idade, salario
					);
		
		System.out.println(frase);
	}
}
