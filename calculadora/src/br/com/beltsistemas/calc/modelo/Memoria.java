package br.com.beltsistemas.calc.modelo;

import java.util.ArrayList;
import java.util.List;

public class Memoria {
//  Classe Singleton: padrão de projeto onde a classe possui somente UMA instância

//  Memoria será a classe responsável por armazenar o valor atual da calculadora
//  e também por notificar os observadores (no caso, o Display) sobre as alterações nesse valor.

    private static final Memoria INSTANCIA = new Memoria();

    private String textoAtual = "";

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

    public void processarComando(String valor) { // ouve o evento e avisa aos observadores que o valor foi alterado
        if ("AC".equals(valor)) {
            textoAtual = "";
        } else {
            textoAtual += valor;
        }

        OBSERVADORES.forEach(o -> o.valorAlterado(getTextoAtual()));
    }
}
