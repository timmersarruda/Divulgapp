package br.timmers;

import java.util.ArrayList;
import java.util.List;

public class SistControleDeUsuario {
	
	private List<Usuario> usuarios;
	private List<Promoter> promoters;
	private List<Locador> locadores;


	public SistControleDeUsuario() {
		this.usuarios = new ArrayList<>();
		this.promoters = new ArrayList<>();
		this.locadores = new ArrayList<>();
		
	}
	public boolean estahCadastrado(String cpf) {
		for(Usuario u: this.usuarios) {
			if(u.getCpf().equals(cpf)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean cadastrarUsuario(String nome, int idade, String cpf, String email, CategoriaUsuario categoria) {
		if(this.estahCadastrado(cpf)) {
			return false;
		}else {
			Usuario usuario = new Usuario(nome, idade, cpf, email, categoria);
			this.usuarios.add(usuario);
			return true;
		}
	}

	public CategoriaUsuario getCategoriaUsuario(CategoriaUsuario categoria) {
		return categoria;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public List<Promoter> getPromoters() {
		return promoters;
	}

	public void setPromoters(List<Promoter> promoters) {
		this.promoters = promoters;
	}

	public List<Locador> getLocadores() {
		return locadores;
	}

	public void setLocadores(List<Locador> locadores) {
		this.locadores = locadores;
	}




}
