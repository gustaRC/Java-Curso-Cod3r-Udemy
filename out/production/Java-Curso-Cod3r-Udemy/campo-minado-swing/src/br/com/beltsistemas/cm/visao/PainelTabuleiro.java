package br.com.beltsistemas.cm.visao;

import java.awt.GridLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import br.com.beltsistemas.cm.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class PainelTabuleiro extends JPanel{
	
	public PainelTabuleiro(Tabuleiro tabuleiro) {
		
		setLayout(new GridLayout(tabuleiro.getLinhas(), tabuleiro.getColunas()));
		
		tabuleiro.paraCada(c -> add(new BotaoCampo(c))); //forEach campos list 
		
		tabuleiro.registrarObservador(e -> {
			SwingUtilities.invokeLater(() -> { // somente será executado depois de todos os eventos do swing serem ativados
				if (e.isGanhou()) {
					JOptionPane.showMessageDialog(this, "Ganhou :)");
				} else {
					JOptionPane.showMessageDialog(this, "Perdeu :)");				
				}
				
				tabuleiro.reiniciar();
			});
		});
	}
}
