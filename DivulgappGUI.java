package br.timmers;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class DivulgappGUI implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		String nome = JOptionPane.showInputDialog(janelaPrincipal, "Informe o nome do usuario a ser cadastrado: ");
	}
}



