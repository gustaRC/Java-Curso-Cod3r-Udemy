package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {

		double a = 2;
		double b = a; // atribuição de valor (Tipo primitivo)

		a++;
		b--;

		System.out.println(a + " | " + b);

		DesafioData d1 = new DesafioData(1, 6, 2022);
		DesafioData d2 = d1;

		d1.dia = 99;
		d2.mes = 99;

		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());

		int c = 5;
		alterarPrimitivo(c); // valor continuara 5
		// a referencia de memoria da variavel c é diferente do parametro alterado na
		// função
		System.out.println(c);
	}

	// um parametro recebe assim como as instancias uma referencia na memória
	// logo um tipo primitivo não poderá ser alterado
	static void alterarPrimitivo(int num) {
		num++;
	}
}
