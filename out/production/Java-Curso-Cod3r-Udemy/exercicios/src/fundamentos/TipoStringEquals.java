package fundamentos;

public class TipoStringEquals {

	public static void main(String[] args) {

		System.out.println("2" == "2");

		String s = new String("2");
		String s2 = "2";
		
		System.out.println("2" == s); // == false
		System.out.println(s2 == s); // == false
		// Prefira utilizar equals para String, ao inves do ==
		// Isso acontece pois o Java irá comparar a referencia na mémoria, 
		// logo ao lidar com Objetos (como a String) irá dar valores diferentes na referencia,
		// porque não é atribuido diretamente seu valor, mas sim a referencia do Objeto
		System.out.println("2".equals(s)); // == true
	}
}
