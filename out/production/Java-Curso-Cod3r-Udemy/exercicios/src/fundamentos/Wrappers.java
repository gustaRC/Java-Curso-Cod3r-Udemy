package fundamentos;

public class Wrappers {

	public static void main(String[] args) {
		
		//Númericos
		Byte b = 100;
		byte b2 = 101; //primitivo
		
		System.out.println("b é igual a 200? " + b.equals(200));
		
		Short s = 1000;
		short s2 = 1001; //primitivo
		
		System.out.println("Classe da variável s: " + s.getClass());
		
		Integer i = 10000;
		int i2 = 10001; //primitivo
		
		System.out.printf("O valor de i é: %d; Contudo, a conversão para byte fica: %d.\n",
				i.intValue(), i.byteValue());
		
		Long l = 10000000L;
		long l2 = 10000001L; //primitivo
		
		Float f = 123.1F;
		float f2 = 234.4F; //primitivo
		
		Double d = 2345.3121;
		double d2 = 393.1092; //primitivo
		
		//Booleano
		Boolean bo = true;
		boolean bo2 = false; // primitivo
		
		System.out.println(bo.toString().toUpperCase());
	
		//Caractere
		Character c = '#';
		char c2 = '?'; //primitivo
		
		System.out.println("Código hash de c: " + c.hashCode());
	}
}
