package fundamentos;

public class ConversaoNumeroParaString {

	public static void main(String[] args) {

		// Forma 1 - Usando Wrapper
		Integer num1 = 10000;
		System.out.println(num1.toString()); // Convertido para string
		System.out.println("Length: " + num1.toString().length()); // permitido usar métodos proprios das Strings

		// Forma 2 - Usando metodos dos wrappers
		int num2 = 20000; // tipo primitivo
		System.out.println(Integer.toString(num2)); // Convertido para string
	}
}
