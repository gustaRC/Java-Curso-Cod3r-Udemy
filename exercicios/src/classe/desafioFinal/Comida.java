package classe.desafioFinal;

public class Comida {
	
	String nome;
	double peso;
	
	public Comida() {
		this("Comida", 0.200);
	}
	
	public Comida(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	void imprimirInformacoes() {
		System.out.printf("-- Informações Comida --\n"
				+ "- Nome: %s;\n"
				+ "- Peso: %.2f.\n\n", this.nome, this.peso);
	}
}
