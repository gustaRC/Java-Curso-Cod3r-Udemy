package br.com.beltsistemas.calculo;

import br.com.beltsistemas.calculo.interno.OperacoesAritmeticas;

public class Calculadora {

    private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

    public double soma(double... nums) { // delegate methods
        return opAritmeticas.soma(nums);
    }
}
