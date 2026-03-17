package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {

	public static void main(String[] args) {

//		JFrame = janela/tela da aplicação
		JFrame janela = new JFrame("Observador");
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // com essa configuração, agora sim ao fechar a tela,
																	// a aplicação é completamente finalizada
		janela.setSize(600, 200);
		janela.setLayout(new FlowLayout()); // com essá configuração ele redimensiona os elementos de uma forma mais
											// dinamica
		janela.setLocationRelativeTo(null); // centralizará a tela com alguma referencia, deixando 'null' será
											// centralizado com a tela do computador

		JButton botao = new JButton("Clicar!"); // por padrão o button terá width e height 100%
		janela.add(botao);

//		ActionListener -> FuncionalInterface
		botao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Evento ocorreu!");
			}
		});

		botao.addMouseListener(new MouseListener() {
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("Tirou o mouse sobre o botão...");
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("O mouse está sobre o botão...");
			}

			@Override
			public void mouseClicked(MouseEvent e) {
			}
			@Override
			public void mousePressed(MouseEvent e) {
			}
			@Override
			public void mouseReleased(MouseEvent e) {
			}
		});

//		sem definir o setVisible como 'true' não acontecerá nada
		janela.setVisible(true);
//		detalhe interessante é que se fecharmos a janela a aplicação ainda 
//		consta como se estivesse rodando, pois não é assim que se esperaria sair da tela
	}
}