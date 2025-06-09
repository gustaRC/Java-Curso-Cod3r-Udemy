package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		//Converção IMPLICITA
		double a = 1; //convertido literal int 1 para double (tipo da variável)
		System.out.println(a);
		
		//Atribuindo tipo valor
		float b = 1.0F; //EXPLICITANDO que 1.0 é float, logo o Java não converte nem interpreta diferente disso
		
		//Conversão EXPLICITA - cast
		float b_cast = (float) 1.234; //O Java CONVERTE o valor que seria naturalmente double, para float
		
		//Perca de informação
		var valor = 10.2344445539202;
		double d = valor;
		System.out.println("double: " + d);
		
		float f = (float) valor;
		System.out.println("cast float: " + f);
		
		
		int c = 128; //número não suportado pelo byte
//		byte d_byte = c; //ERRO
		byte d_byte = (byte) c;
		System.out.println("int -> byte: " + d_byte); //foi para o "proximo" numero do range, 127 (NUM LIMITE) foi para -128 (NUM MIN LIMITE)
	}
}
