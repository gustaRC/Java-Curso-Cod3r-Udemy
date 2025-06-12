package classe;

public class DesafioDataInstanciada {

	public static void main(String[] args) {

		DesafioData data1 = new DesafioData();
		data1.dia = 02;
		data1.mes = 12;
		data1.ano = 2004;
		
		DesafioData data2 = new DesafioData();
		data2.dia = 25;
		data2.mes = 05;
		data2.ano = 2013;
		
		System.out.printf("Data 1: %d/%d/%d", 
				data1.dia, data1.mes, data1.ano);
		
		System.out.printf("\nData 2: %d/%d/%d", 
				data2.dia, data2.mes, data2.ano);
	}
}
