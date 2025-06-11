package controle;

public class WhileDeterminado {
	//While Determinado pois sabemos quantas vezes será repetido o laço
	public static void main(String[] args) {
		
		int contador = 1;
		
		while (contador <= 10) {
			System.out.println("Bom dia! " + contador);
			contador++;
		}
	}
}
