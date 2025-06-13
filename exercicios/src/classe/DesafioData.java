package classe;

public class DesafioData {

	int dia;
	int mes;
	int ano;
	
	String obterDataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
}
