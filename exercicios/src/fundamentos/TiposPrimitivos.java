package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		// Informações do funcionário
		
		//Tipos Númericos
		byte anosDeEmpresa = 23;
//		byte anosDeEmpresa = 128; //ERRO
		
		short numeroDeVoos = 542;
//		short numeroDeVoos = 32768; //ERRO
		
		int id = 57892;
		
//		long pontosAcumulados = 3_234_845_233; //literal int == ERRO
		long pontosAcumulados = 3_234_845_233L; //literal long == OK
		
		//Tipos Númericos Reais
		float salario = 11_445.45F; //literal float == OK
//		float salario = 11_445.45; //literal double == ERRO
		
		double vendasAcumuladas = 2_991_332_834.01;
		
		//Tipo Booleano
		boolean estaDeFerias = false; //OU true
		
		//Tipo Caractere
		char status = 'A'; //== ativo
		
		
		// Dias de Empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Número de Viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		
		System.out.println("Ferias? " + estaDeFerias );
		
		System.out.println("Status: " + status);
	}
}
