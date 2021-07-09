package br.timmers;

import static org.junit.jupiter.api.Assertions.fail;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class SistControleDeUsuario implements SistInterfacePrincipal {
	
	private List<Usuario> usuarios;
	private List<Promoter> promoters;
	private List<Locador> locadores;
	private GravadorDeDados gravador;


	public SistControleDeUsuario() {
		this.usuarios = new ArrayList<>();
		this.promoters = new ArrayList<>();
		this.locadores = new ArrayList<>();
		this.gravador = new GravadorDeDados();
		this.recuperarDados();
		
	}
	
	public void recuperarDados() {
		try {
			this.usuarios = this.gravador.recuperarUsuarios();
		} catch (IOException e) {
			JOptionPane.showInternalMessageDialog(null, "Erro ao recuperar dados:"+e.getMessage());
		}
	}
	
	public void salvarDados() {
		try {
			this.gravador.gravarUsuarios(usuarios);
		} catch (IOException e) {
			System.out.println("Erro ao salvar:"+e.getMessage());
		}
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
	
	




}
