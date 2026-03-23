package br.com.beltsistemas.calc.visao;

import javax.swing.*;
import java.awt.*;

public class Calculadora extends JFrame {

    private final int width = 332;
    private final int height = 422;

    public Calculadora() {

        organizarLayout();

        setSize(width, height);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void organizarLayout() {
        setLayout(new BorderLayout());

        Display display = new Display();
        display.setPreferredSize(new Dimension(332, 80));
        add(display, BorderLayout.NORTH);

        Teclado teclado = new Teclado();
        add(teclado, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new Calculadora();
    }
}
