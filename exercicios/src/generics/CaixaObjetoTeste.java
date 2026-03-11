package generics;

public class CaixaObjetoTeste {
	
	public static void main(String[] args) {
		
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.3); //double -> Double

		Integer coisa = (Integer) caixaA.abrir(); //cast perigoso
		System.out.println(coisa); //erro por causa da conversão/cast dos tipos
		//não alarma erro, mas ocorre uma exeção não tratada
	}

}
