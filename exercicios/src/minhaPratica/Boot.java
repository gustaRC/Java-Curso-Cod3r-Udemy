package minhaPratica;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import minhaPratica.classes.User;
import minhaPratica.enums.Occupations;

public class Boot {

	public static void main(String[] args) {
	
		JTextField nameField = new JTextField(15);
        JTextField birthField = new JTextField(10);
        JTextField emailField = new JTextField(20);
		
		
        JPanel panel = new JPanel();
//        panel.add(new JOptionPane("-- Sessão de Compras --"));
        panel.add(new JLabel("Nome:"));
        panel.add(nameField);
        panel.add(Box.createHorizontalStrut(15)); // espaço
        panel.add(new JLabel("Idade:"));
        panel.add(birthField);
        panel.add(Box.createHorizontalStrut(15));
        panel.add(new JLabel("Email:"));
        panel.add(emailField);
        
		
        int result = JOptionPane.showConfirmDialog(
                null, 
                panel, 
                "Preencha os dados", 
                JOptionPane.OK_CANCEL_OPTION, 
                JOptionPane.PLAIN_MESSAGE
            );
        
		System.out.println(result);
	}
}
