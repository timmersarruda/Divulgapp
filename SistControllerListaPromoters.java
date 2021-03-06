package br.timmers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;

public class SistControllerListaPromoters implements ActionListener{
	SistInterfacePrincipal sistema;
	SistDivulgappGUI janelaPrincipal;
	public SistControllerListaPromoters(SistInterfacePrincipal sistema ,SistDivulgappGUI janelaPrincipal ) {
		this.sistema = sistema;
		this.janelaPrincipal = janelaPrincipal;
	}
	

	public void actionPerformed(ActionEvent e) {
		List<Promoter> listaPromoters= sistema.getPromoters();
		for(Promoter p: listaPromoters) {
			JOptionPane.showMessageDialog(janelaPrincipal, p.toString());
		}
		
	}
/*
	public List<Promoter> actionListener(ActionEvent e) {
		List<Promoter> listaDePromoters= sistema.getPromoters();
		for(Promoter p: listaDePromoters) {
			JOptionPane.showMessageDialog(janelaPrincipal, p);
			
		}
		return listaDePromoters;

	}
*/
}
