package classe.desafioFinal;

public class Pessoa {

	String nome;
	double peso;

	Pessoa() {
		this("Pessoa", 70);
	}

	Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}

	void comer(Comida comida) {
		if(comida != null) {			
			peso += comida.peso;
		}
	}
	
	void imprimirInformacoes() {
		System.out.printf("-- Informações Pessoa --\n"
				+ "- Nome: %s;\n"
				+ "- Peso: %.2f.\n\n", this.nome, this.peso);
	}
}
