package br.timmers;

import java.util.List;

public class SistControleDeUsuario extends Usuario {
	
	private List<Usuario> usuarios;
	private List<Promoter> promoters;
	private List<Locador> locadores;
	private List<Endereco> enderecos;

	public SistControleDeUsuario(String nome, int idade, String cpf, String email) {
		super(nome, idade, cpf, email);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}


}
