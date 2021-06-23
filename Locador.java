package br.timmers;

import java.util.List;

public abstract class Locador extends Usuario{

	private List<Endereco> endereco;
	
	public Locador(String nome, int idade, String cpf, String email) {
		super(nome, idade, cpf, email); 
	}

	
	
}
