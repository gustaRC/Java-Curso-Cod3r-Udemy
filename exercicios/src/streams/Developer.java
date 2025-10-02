package streams;

public class Developer {

	private String nome;
	private int tarefasDesenvolvidas;
	private int errosNoTeste;
	private int enviadasParaTeste;
	private int tarefasAbertas;
	
	public Developer(String nome) {
		this.nome = nome;
		this.tarefasDesenvolvidas = 0;
		this.errosNoTeste = 0;
		this.enviadasParaTeste = 0;
		this.tarefasAbertas = 0;
	}
	
	public Developer(
			String nome, 
			int tarefasDesenvolvidas,
			int errosNoTeste,
			int enviadasParaTeste,
			int tarefasAbertas
			) {
		this.nome = nome;
		this.tarefasDesenvolvidas = tarefasDesenvolvidas;
		this.errosNoTeste = errosNoTeste;
		this.enviadasParaTeste = enviadasParaTeste;
		this.tarefasAbertas = tarefasAbertas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTarefasDesenvolvidas() {
		return tarefasDesenvolvidas;
	}

	public void setTarefasDesenvolvidas(int tarefasDesenvolvidas) {
		this.tarefasDesenvolvidas = tarefasDesenvolvidas;
	}

	public int getErrosNoTeste() {
		return errosNoTeste;
	}

	public void setErrosNoTeste(int errosNoTeste) {
		this.errosNoTeste = errosNoTeste;
	}

	public int getEnviadasParaTeste() {
		return enviadasParaTeste;
	}

	public void setEnviadasParaTeste(int enviadasParaTeste) {
		this.enviadasParaTeste = enviadasParaTeste;
	}

	public int getTarefasAbertas() {
		return tarefasAbertas;
	}

	public void setTarefasAbertas(int tarefasAbertas) {
		this.tarefasAbertas = tarefasAbertas;
	}

	@Override
	public String toString() {
		return "Developer " + nome;
	}	
}
