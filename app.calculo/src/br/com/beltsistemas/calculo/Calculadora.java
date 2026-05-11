package br.com.beltsistemas.calculo;

import br.com.beltsistemas.calculo.interno.OperacoesAritmeticas;
import br.com.beltsistemas.logger.Logger;

public class Calculadora {

    private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

    public double soma(double... nums) { // delegate methods
        Logger.info("Somando...");
        return opAritmeticas.soma(nums);
    }

    public static Class<Logger> getLoggerClass() {
        return Logger.class;
    }
}
