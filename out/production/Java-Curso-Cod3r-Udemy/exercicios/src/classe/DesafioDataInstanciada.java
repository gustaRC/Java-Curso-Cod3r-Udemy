package classe;

public class DesafioDataInstanciada {

	public static void main(String[] args) {

		DesafioData data1 = new DesafioData();
		
		DesafioData data2 = new DesafioData(25, 05, 2013);
		
		System.out.printf("Data 1: %s", 
				data1.obterDataFormatada());
		
		System.out.printf("\nData 2: %s", 
				data2.obterDataFormatada());
	}
}
