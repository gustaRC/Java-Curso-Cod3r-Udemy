package classe;

public class DesafioData {

	int dia;
	int mes;
	int ano;
	
	DesafioData() {
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	
	DesafioData(int diaInicial, int mesInicial, int anoInicial) {
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}
	
	String obterDataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
}
