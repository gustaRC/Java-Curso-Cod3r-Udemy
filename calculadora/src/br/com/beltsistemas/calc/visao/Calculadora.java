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
/*
*   PASSO A PASSO DO FUNCIONAMENTO DO OBSERVADOR NA CALCULADORA:
*   1. Botão renderizado com um ActionListener(propria Classe Teclado implements ActionListener) que chama o método @Override 'actionPerformed';
*   2. Classe Display(implementa a interface MemoriaObservador com o método 'valorAlterado') na sua inicialização se registra no list OBSERVADORES da Classe Método;
*   3. Método 'actionPerformed' chama o método 'processarComando' da classe Memoria, passando o valor do botão clicado como argumento (String valor);
*   4. O método 'processarComando' da classe Memoria atualiza o valor armazenado (textoAtual) de acordo com o comando recebido (ex: "AC" limpa o valor, outros comandos concatenam o valor);
*   5. Após atualizar o valor, o método 'processarComando' notifica todos os observadores registrados (no caso, o Display) sobre a alteração do valor utilizando o método valorAlterado da interface MemoriaObservador;
*   6. Método @Override valorAlterado presente na classe Display atualiza o valor do label apresentado.
*/