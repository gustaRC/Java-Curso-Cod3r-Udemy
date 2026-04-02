package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Celta;
import oo.heranca.desafio.Ferrari;

public class DesafioCarro {

	public static void main(String[] args) {

//		Carro ferrari = new Ferrari(); // não temos acesso aos metodos interface
		Ferrari ferrari = new Ferrari(); // temos acesso aos metodos interface
		Carro celta = new Celta();

		System.out.printf("Ferrari - %s\n", ferrari);
		System.out.printf("Celta - %s\n", celta);

		ferrari.ligarTurbo();
		ferrari.ligarAr();

		ferrari.acelerar();
		ferrari.acelerar();

		celta.acelerar();

		System.out.printf("Ferrari - %s\n", ferrari);
		System.out.printf("Celta - %s\n", celta);

		ferrari.freiar();

		celta.freiar();
		celta.freiar();

		ferrari.desligarAr();
		ferrari.desligarTurbo();

		System.out.printf("Ferrari - %s\n", ferrari);
		System.out.printf("Celta - %s\n", celta);
	}
}
