package br.timmers;

import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import java.awt.*;


public class SistDivulgappGUI extends JFrame {
	

	private static final long serialVersionUID = 1L;


	public static void main(String [] args) {
		JFrame janelaPrincipal = new SistDivulgappGUI();
		janelaPrincipal.setVisible(true);
		janelaPrincipal.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	JLabel linha1, linha2;
	ImageIcon eventImg = new ImageIcon("./img/EventImg.jpeg");
	SistInterfacePrincipal sistema = new SistControleDeUsuario();
	JMenuBar barraDeMenu = new JMenuBar();
	
	
	public SistDivulgappGUI() {
		setTitle("Divulgapp");
		setSize(400,200);
		setLocation(150,150);
		setResizable(false);
		getContentPane().setBackground(Color.ORANGE);
		
		linha1 = new JLabel("Sistema de gestão de eventos", JLabel.CENTER);
		linha1.setForeground(Color.BLACK);
		linha1.setFont(new Font("Serif", Font.BOLD, 20));
		setLayout(new GridLayout(4,1));
		
		JMenu menuCadastrar = new JMenu("Cadastre-se");
		JMenuItem menuCadastrarUsuario = new JMenuItem("Cadastrar usuario");
		menuCadastrar.add(menuCadastrarUsuario);
		menuCadastrarUsuario.addActionListener(new SistControllerCadastro(this.sistema,this));
		
		JMenu menuPesquisarPromoter = new JMenu("Exibir Promoters");
		JMenuItem menuExibirPromoter = new JMenuItem("Pesquisar Usuario Promoter");
		menuPesquisarPromoter.add(menuExibirPromoter);
		menuPesquisarPromoter.addActionListener(new SistControllerListaPromoters(this.sistema,this));
		
		JMenu menuPesquisarLocais = new JMenu("Exibir Locais disponíveis");
		JMenuItem menuExibirLocais = new JMenuItem("Pesquisar local disponível");
		menuPesquisarLocais.add(menuExibirLocais);
		
		JMenu menuExibirEvento = new JMenu("Exibir eventos");
		JMenuItem menuPesquisarEventos = new JMenuItem("Buscar próximos eventos ");
		menuExibirEvento.add(menuPesquisarEventos);
	
	
		barraDeMenu.add(menuCadastrar);
		barraDeMenu.add(menuPesquisarPromoter);
		barraDeMenu.add(menuExibirLocais);
		barraDeMenu.add(menuExibirEvento);
		add(barraDeMenu);
		add(linha1);
		add(new JLabel());
		
	}
	
	
}