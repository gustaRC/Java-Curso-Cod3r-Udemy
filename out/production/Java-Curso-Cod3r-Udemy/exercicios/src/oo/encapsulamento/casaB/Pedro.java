package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

	Ana mae = new Ana();

	void testeAcessos() {
//		System.out.println(mae.segredo); // ERRO private
//		System.out.println(mae.facoDentroDeCasa); // ERRO package
//		System.out.println(mae.formaDeFalar); // ERRO protected
		System.out.println(formaDeFalar); // CERTO protected
		System.out.println(super.formaDeFalar); // CERTO protected
		System.out.println(mae.todosSabem);
	}
}
