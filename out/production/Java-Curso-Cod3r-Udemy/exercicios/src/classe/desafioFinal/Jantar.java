package classe.desafioFinal;

public class Jantar {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Gustavo", 73.5);
		p1.imprimirInformacoes();

		Comida c1 = new Comida("Feijoada", 0.380);
		Comida c2 = new Comida();
		c1.imprimirInformacoes();
		c2.imprimirInformacoes();

		System.out.println("Começou o Jantar!\n");

		p1.comer(c1);
		p1.imprimirInformacoes();

		p1.comer(c2);
		p1.imprimirInformacoes();
	}
}
