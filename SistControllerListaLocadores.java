package br.timmers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;

public class SistControllerListaLocadores implements ActionListener{

		SistInterfacePrincipal sistema;
		SistDivulgappGUI janelaPrincipal;
		public SistControllerListaLocadores(SistInterfacePrincipal sistema ,SistDivulgappGUI janelaPrincipal ) {
			this.sistema = sistema;
			this.janelaPrincipal = janelaPrincipal;
		}
		

		public void actionPerformed(ActionEvent e) {
			List<Locador> listaLocadores= sistema.getLocadores();
			for(Locador l: listaLocadores) {
				JOptionPane.showMessageDialog(janelaPrincipal, l.toString());
			}
			
		}
		
		

}
