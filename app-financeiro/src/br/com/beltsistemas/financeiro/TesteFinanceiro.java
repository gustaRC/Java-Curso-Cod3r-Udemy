package br.com.beltsistemas.financeiro;

import br.com.beltsistemas.app.Calculadora;

import java.util.ServiceLoader;

public class TesteFinanceiro {

    public static void main(String[] args) {

        Calculadora calc = ServiceLoader
                .load(Calculadora.class)
                .findFirst() //chamando a primeira implementação encontrada para a Interface Calculadora
                .get();
        System.out.println(calc.soma(1, 2, 3));
    }
}
