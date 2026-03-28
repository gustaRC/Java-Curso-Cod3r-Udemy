package classe;

public class DesafioData {

	int dia; //variavel de instancia
//	static int dia; //variavel de classe
	int mes;
	int ano;
	
	DesafioData() {
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		this(1, 1, 1970); //chamando o outro método
	}
	
	DesafioData(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterDataFormatada() {
		String formato = "%d/%d/%d"; //variavel local
		return String.format(formato, dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		System.out.println(this.obterDataFormatada());
	}
}
