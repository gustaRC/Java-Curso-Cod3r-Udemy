package oo.encapsulamento;

public class Pessoa {

	private String nome;
	private int idade;

	public Pessoa(String nome, int idade) {
		setNome(nome);
		setIdade(idade);
	}

	// Getter
	public int getIdade() {
		return idade;
	}

	// Setter
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if (novaIdade >= 0 && novaIdade <= 120) {
			this.idade = novaIdade;
		}
	}

	// Gerado pelo Eclipse IDE
	public String getNome() {
		return nome;
	}

	// Gerado pelo Eclipse IDE
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Pessoa: " + getNome();
	}
}