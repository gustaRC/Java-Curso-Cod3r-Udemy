package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {

	Ana sogra = new Ana();

	void testeAcessos() {
//		System.out.println(sogra.segredo); // ERRO private
//		System.out.println(sogra.facoDentroDeCasa); // ERRO package
//		System.out.println(sogra.formaDeFalar); // ERRO protected
		System.out.println(sogra.todosSabem);
	}
}
