package br.com.beltsistemas.financeiro;

import br.com.beltsistemas.calculo.Calculadora;

public class TesteFinanceiro {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.soma(2, 5, 3));

        Calculadora.getLoggerClass();
    }
}
