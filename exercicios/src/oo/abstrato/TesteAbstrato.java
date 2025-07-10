package oo.abstrato;

public class TesteAbstrato {

	public static void main(String[] args) {
		
		System.out.println("Tipo Animal:");
		Animal a = new Cachorro();
		System.out.println(a.respirar());
		System.out.println(a.mover());
		
		System.out.println("\nTipo Mamifero:");
		Mamifero a2 = new Cachorro();
		System.out.println(a2.respirar());
		System.out.println(a2.parir());
		System.out.println(a2.mover());
		System.out.println(a2.mamar());
		
		System.out.println("\nTipo Cachorro:");
		Cachorro a3 = new Cachorro();
		System.out.println(a3.respirar());
		System.out.println(a3.parir());
		System.out.println(a3.mover());
		System.out.println(a3.mamar());
		System.out.println(a3.comer());
	}
}
