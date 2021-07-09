package br.timmers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class SistControllerCadastro implements ActionListener {
	
	SistInterfacePrincipal sistema;
	SistDivulgappGUI janelaPrincipal;
	public SistControllerCadastro(SistInterfacePrincipal sistema ,SistDivulgappGUI janelaPrincipal ) {
		this.sistema = sistema;
		this.janelaPrincipal = janelaPrincipal;
	}
	

	public void actionPerformed(ActionEvent e) {
		String nome = JOptionPane.showInputDialog(janelaPrincipal, "Informe o nome do usuario a ser cadastrado: ");
		int idade = Integer.parseInt(JOptionPane.showInputDialog(janelaPrincipal, "Informe a sua idade: "));
		String cpf = JOptionPane.showInputDialog(janelaPrincipal, "Informe o seu CPF: ");
		String email = JOptionPane.showInputDialog(janelaPrincipal, "Informe o seu email: ");
		CategoriaUsuario categoria = CategoriaUsuario.valueOf(JOptionPane.showInputDialog(janelaPrincipal, "Informe a categoria desejada: "));
		boolean cadastrou = sistema.cadastrarUsuario(nome, idade, cpf, email, categoria);
		if(cadastrou) {
			JOptionPane.showMessageDialog(janelaPrincipal, "Cadastro realizado com sucesso");
		}else {
			JOptionPane.showMessageDialog(janelaPrincipal, "Não foi possível realizar o cadastro, verifique se o cpf está cadastrado.");
		}
	}
		
}



