package br.com.beltsistemas.calc.visao;

import br.com.beltsistemas.calc.modelo.Memoria;
import br.com.beltsistemas.calc.modelo.MemoriaObservador;

import javax.swing.*;
import java.awt.*;

public class Display extends JPanel implements MemoriaObservador {

    private final JLabel label = new JLabel(Memoria.getInstancia().getTextoAtual());

    public Display() {
        Memoria.getInstancia().adicionarObservador(this); // registrando no observador da classe Memoria

        setBackground(new Color(46, 49, 50));

        label.setForeground(Color.WHITE);
        label.setFont(new Font("courier", Font.PLAIN, 30));

        setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 40));

        add(label);
    }

    @Override
    public void valorAlterado(String novoValor) {
        label.setText(novoValor);
    }
}
