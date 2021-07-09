package br.timmers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;

public class SistControllerListaUsuarios implements ActionListener{
	SistInterfacePrincipal sistema;
	SistDivulgappGUI janelaPrincipal;
	public SistControllerListaUsuarios(SistInterfacePrincipal sistema ,SistDivulgappGUI janelaPrincipal ) {
		this.sistema = sistema;
		this.janelaPrincipal = janelaPrincipal;
	}
	

	public void actionPerformed(ActionEvent e) {
		List<Usuario> listaUsuarios= sistema.getUsuarios();
		for(Usuario u: listaUsuarios) {
			JOptionPane.showMessageDialog(janelaPrincipal, u.toString());
		}

	}
}
