package oo.composicao;

public class CarroTeste {

	public static void main(String[] args) {

		Carro c1 = new Carro();
		System.out.println(c1.estaLigado());
		
		c1.ligar();
		System.out.println(c1.estaLigado());
		
//		CLASSE/OBJ/MÉTODO - CLASSE/OBJ/MÉTODO
		System.out.println(c1.motor.giros());
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		
		System.out.println(c1.motor.giros());
		
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		
		// Faltou Encapsulamento - Veremos em breve!
//		c1.motor.fatorInjecao = -30; //ERRADO
		
		System.out.println(c1.motor.giros());		
	}
}
