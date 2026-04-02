package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		String s = "É isso ai!";
		
		System.out.println("Sem formatação: " + s);
		System.out.println("COM formatação: " + s.toUpperCase());
		System.out.println("COM formatação2: " + "Será?!".toUpperCase());
		
		//Substituindo palavras
		s = s.replace("!", "?");
		System.out.println("Substituido '!' por '?': " + s);
		
		//Concatenar
		s = s.concat(" É isso mesmo!");
		System.out.println("Concatenado: " + s);
		
		//Utilizando mais de uma notação ponto
		String y = "Boa noite X"
				.replace("X", "Gus")
				.toUpperCase()
				.concat("!!");
		System.out.println(y);
	}
}
