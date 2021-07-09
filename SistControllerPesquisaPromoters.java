
/*
package br.timmers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;

public class SistControllerPesquisaPromoters implements ActionListener{

	SistInterfacePrincipal sistema;
	SistDivulgappGUI janelaPrincipal;
	public SistControllerPesquisaPromoters(SistInterfacePrincipal sistema ,SistDivulgappGUI janelaPrincipal ) {
		this.sistema = sistema;
		this.janelaPrincipal = janelaPrincipal;
	}
	

	public List<Promoter> actionListener(ActionEvent e) {
		List<Promoter> listaDePromoters= sistema.getPromoters();
		for(Promoter p: listaDePromoters) {
			JOptionPane.showMessageDialog(janelaPrincipal, p);
			
		}
		return listaDePromoters;

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}


*/