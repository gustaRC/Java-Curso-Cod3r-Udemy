package br.com.beltsistemas.calc.modelo;

import java.util.ArrayList;
import java.util.List;

public class Memoria {
//  Classe Singleton: padrão de projeto onde a classe possui somente UMA instância

//  Memoria será a classe responsável por armazenar o valor atual da calculadora
//  e também por notificar os observadores (no caso, o Display) sobre as alterações nesse valor.

    private enum TipoComando {
        ZERAR, NUMERO, DIV, MULT, SUB, SOMA, IGUAL, VIRGULA, SINAL
    }

    ;

    private static final Memoria INSTANCIA = new Memoria();

    private TipoComando ultimaOperacao = null;
    private boolean substituir = false;
    private String textoAtual = "";
    private String textoBuffer = "";

    private final List<MemoriaObservador> OBSERVADORES = new ArrayList<>(); // lista de observadores de eventos

    private Memoria() {
    }

    public static Memoria getInstancia() {
        return INSTANCIA;
    }

    public void adicionarObservador(MemoriaObservador observador) {
        OBSERVADORES.add(observador);
    }

    public String getTextoAtual() { // formatação do texto a ser exibido no Display
        return textoAtual.isEmpty() ? "0" : textoAtual;
    }

    public void processarComando(String texto) { // ouve o evento e avisa aos observadores que o valor foi alterado

        TipoComando tipoComando = detectarTipoComando(texto);

        if (tipoComando == null) {
            return;
        } else if (tipoComando == TipoComando.ZERAR) {
            textoAtual = "";
            textoBuffer = "";
            substituir = false;
            ultimaOperacao = null;
        } else if (tipoComando == TipoComando.SINAL && textoAtual.contains("-")) {
            textoAtual = textoAtual.substring(1);
        } else if (tipoComando == TipoComando.SINAL) {
            textoAtual = "-" + textoAtual;
        } else if (tipoComando == TipoComando.NUMERO || tipoComando == TipoComando.VIRGULA) {
//          textoAtual = substituir == true ? 'SUBSTITUIR' : 'ACRESCENTA'
            textoAtual = substituir ? texto : textoAtual + texto;
            substituir = false;
        } else {
            substituir = true;
            textoAtual = obterResultadoOperacao();
            textoBuffer = textoAtual;
            ultimaOperacao = tipoComando;
        }

        OBSERVADORES.forEach(o -> o.valorAlterado(getTextoAtual()));

    }
    private String obterResultadoOperacao() {
//      TODO Adicionar funcionalidade de alternar sinal do valor (negativo/positivo) "±"

        if (ultimaOperacao == null || ultimaOperacao == TipoComando.IGUAL) {
            return textoAtual;
        }

        double numeroBuffer = Double.parseDouble(textoBuffer.replace(",", "."));
        double numeroAtual = Double.parseDouble(textoAtual.replace(",", "."));
        double resultado = 0;

        if (ultimaOperacao == TipoComando.SOMA) {
            resultado = numeroBuffer + numeroAtual;
        } else if (ultimaOperacao == TipoComando.SUB) {
            resultado = numeroBuffer - numeroAtual;
        } else if (ultimaOperacao == TipoComando.MULT) {
            resultado = numeroBuffer * numeroAtual;
        } else if (ultimaOperacao == TipoComando.DIV) {
            resultado = numeroBuffer / numeroAtual;
        }

        String resultadoString = Double.toString(resultado).replace(".", ",");
        boolean inteiro = resultadoString.endsWith(",0");

        return inteiro ? resultadoString.replace(",0", "") : resultadoString;
    }

    private TipoComando detectarTipoComando(String texto) {
        if (textoAtual.isEmpty() && texto.equals("0")) {
            return null;
        }

        try {
            Integer.parseInt(texto);
            return TipoComando.NUMERO;
        } catch (NumberFormatException e) {
            // Quando não for número...
            if ("AC".equals(texto)) {
                return TipoComando.ZERAR;
            } else if ("/".equals(texto)) {
                return TipoComando.DIV;
            } else if ("*".equals(texto)) {
                return TipoComando.MULT;
            } else if ("-".equals(texto)) {
                return TipoComando.SUB;
            } else if ("+".equals(texto)) {
                return TipoComando.SOMA;
            } else if (",".equals(texto) && !textoAtual.contains(",")) {
                return TipoComando.VIRGULA;
            } else if ("=".equals(texto)) {
                return TipoComando.IGUAL;
            } else if ("±".equals(texto)) {
                return TipoComando.SINAL;
            }
        }

        return null;
    }
}
