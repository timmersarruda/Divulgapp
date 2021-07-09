package br.timmers;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.List;

public class SistControleDeUsuario implements SistInterfacePrincipal {
	
	private List<Usuario> usuarios;
	private List<Promoter> promoters;
	private List<Locador> locadores;


	public SistControleDeUsuario() {
		this.usuarios = new ArrayList<>();
		this.promoters = new ArrayList<>();
		this.locadores = new ArrayList<>();
	}
	
	public void recuperarDados() {

	}
	
	
	@Override
	public boolean estahCadastrado(String cpf) {
		for(Usuario u: this.usuarios) {
			if(u.getCpf().equals(cpf)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public boolean cadastrarUsuario(String nome, int idade, String cpf, String email, CategoriaUsuario categoria) {
		if(this.estahCadastrado(cpf)) {
			return false;
		}else {
			Usuario usuario = new Usuario(nome, idade, cpf, email, categoria);
			this.usuarios.add(usuario);
			return true;
		}
	}
	
	@Override
	public boolean cadastrarPromoter(String nome, int idade, String cpf, String email, CategoriaUsuario categoria, String cnpj) {
		if(this.estahCadastrado(cnpj)) {
			return false;
		}else {
			Usuario usuario = new Usuario(nome, idade, cpf, email, categoria);
			this.usuarios.add(usuario);
			return true;
		}
	}
	
	@Override
	public boolean cadastrarLocador(String nome, int idade, String cpf, String email, CategoriaUsuario categoria, List<Endereco> endereco) {
		if(this.estahCadastrado(cpf)) {
			return false;
		}else {
			Usuario usuario = new Usuario(nome, idade, cpf, email, categoria);
			this.usuarios.add(usuario);
			return true;
		}
	}
	
	@Override
	public List<Promoter> pesquisarPromoter(String nome, int idade, String cpf, String email, CategoriaUsuario categoria, List<Endereco> endereco) {
		if(this.estahCadastrado(cpf)) {
			return (this.getPromoters());
		}else {
			return erroPesquisa2();
		}
	}
	
	private List<Promoter> erroPesquisa2() {
		return (fail("Não foi possivel encontrar locadores, tente novamente mais tarde."));
	}
	
	@Override
	public List<Usuario> pesquisarUsuario(String nome, int idade, String cpf, String email, CategoriaUsuario categoria) {
		if(this.estahCadastrado(cpf)) {
			return (this.getUsuarios());
		}else {
			return erroPesquisa1();
		}
	}
	
	private List<Usuario> erroPesquisa1() {
		return (fail("Não foi possivel encontrar locadores, tente novamente mais tarde."));
	}
	
	@Override
	public List<Locador> pesquisarLocador(String nome, int idade, String cpf, String email, CategoriaUsuario categoria, List<Endereco> endereco) {
		if(this.estahCadastrado(cpf)) {
			return (this.getLocadores());
		}else {
			return erroPesquisa();
		}
	}
	
	private List<Locador> erroPesquisa() {
		return (fail("Não foi possivel encontrar locadores, tente novamente mais tarde."));
	}
	
	
	@Override
	public CategoriaUsuario getCategoriaUsuario(CategoriaUsuario categoria) {
		return categoria;
	}

	@Override
	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	@Override
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	@Override
	public List<Promoter> getPromoters() {
		return promoters;
	}

	@Override
	public void setPromoters(List<Promoter> promoters) {
		this.promoters = promoters;
	}

	@Override
	public List<Locador> getLocadores() {
		return locadores;
	}

	@Override
	public void setLocadores(List<Locador> locadores) {
		this.locadores = locadores;
	}
	
	public void salvarDados() {
		
	}
	
}


