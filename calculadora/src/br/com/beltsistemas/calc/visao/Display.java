package br.com.beltsistemas.calc.visao;

import javax.swing.*;
import java.awt.*;

public class Display extends JPanel {

    private final JLabel label = new JLabel("1234,56");

    public Display() {
        setBackground(new Color(46, 49, 50));

        label.setForeground(Color.WHITE);
        label.setFont(new Font("courier", Font.PLAIN, 30));

        setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 40));

        add(label);
    }
}
