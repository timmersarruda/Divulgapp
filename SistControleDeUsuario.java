package br.timmers;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.HashMap;

import javax.swing.JFrame;

import java.awt.Color;

public class SistControleDeUsuario extends JFrame{
	
	public SistControleDeUsuario() {
	
		setTitle("Cadastro de Usuarios");
		setSize(400,200);
		setLocation(150, 150);
		// localização da janela na tela
		setResizable(false);
		// janela não redimensonável
		getContentPane().setBackground(Color.DARK_GRAY);

	}
	
	public static void main(String [] args) {
		// Criando um objeto hashmap chamado ListUsuario 
		HashMap<String, String> ListUsuario = new HashMap<String, String>();
		HashMap<String, String> ListPromoter = new HashMap<String, String>();
		HashMap<String, String> ListLocador = new HashMap<String, String>();
		
		//Adicionando Usuarios (nome, cpf)
		ListUsuario.put("Junior", "10032165487");
		ListUsuario.put("José", "10032114798");
		ListUsuario.put("Maria", "10032161245");
		ListUsuario.put("João", "10032145318");
		
		ListPromoter.put("Lisa", "10089545318");
		ListPromoter.put("Tamires", "45889545318");
		
		ListLocador.put("Leon", "65899545318");
		
		JFrame janela = new SistControleDeUsuario();
		janela.setVisible(true);
		WindowListener fechadorDeJanelaPrincipal = new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		janela.addWindowListener(fechadorDeJanelaPrincipal);
	}
	
			
		
	}
	




