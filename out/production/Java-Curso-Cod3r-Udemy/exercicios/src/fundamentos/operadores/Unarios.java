package fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		//Posfixada
		a++; // a = a + 1
		a--; // a = a - 1
		
		//Prefixada
		++b; // b = b + 1
		--b; // b = b - 1
		
		System.out.println("Mini Desafio...");
		System.out.println(++a == b--);
		//true por causa da precedencia dos operadores
		//++ antes do a significa que está com "pressa", então será incrementado antes de comparar
		//-- antes do a significa que "pode esperar", então será decrementado somente depois de comparar
	}
}
