package excecao.personalizadaA;

// 'Serialização' seria transformar um objeto na memória em uma string,
// de tal forma que depois conseguimos 'deserializar' e transforma a string em um objeto na memória novamente.

// Com isso, é criado um ID Serial para saber se uma classe possui compatibilidade com outra mesmo serializada
@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends RuntimeException {

	private String nomeDoAtributo;

	public NumeroForaIntervaloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}

	public String getMessage() {
		return String.format("O atributo %s está fora do intervalo.", nomeDoAtributo);
	}
}
