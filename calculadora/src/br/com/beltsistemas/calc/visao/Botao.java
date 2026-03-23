package br.com.beltsistemas.calc.visao;

import javax.swing.*;
import java.awt.*;

public class Botao extends JButton {

    public Botao(String label, Color cor) {
        setText(label);
        setOpaque(true);
        setBackground(cor);
        setFont(new Font("courier", Font.PLAIN, 30));
        setForeground(Color.WHITE);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
}