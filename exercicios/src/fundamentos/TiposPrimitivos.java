package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		// Informações do funcionário
		
		//Tipos númericos
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
//		short numeroDeVoos = 32767;
//		short numeroDeVoos = 32768; //ERRO
		int id = 57892;
//		long pontosAcumulados = 3_234_845_233; //literal int == ERRO
		long pontosAcumulados = 3_234_845_233L; //literal long == OK
		
		//Tipos númericos reais
//		float salario = 11_445.45; //literal double == ERRO
		float salario = 11_445.45F; //literal float == OK
		
		
	}
}
