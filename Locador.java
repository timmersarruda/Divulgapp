package br.timmers;

import java.util.List;

public class Locador extends Usuario{

	private List<Endereco> endereco;
	String categoria = "LOCADOR";
	
	public Locador(String nome, int idade, String cpf, String email, CategoriaUsuario categoria) {
		super(nome, idade, cpf, email, categoria);
		this.setCategoria(categoria);
	}
	
	public String toString() {
		return "O Locador com os respectivos dados" + getNome() + getIdade() + getEmail() + getCategoria() + " Foi cadastrado com sucesso!";
	}

	public List<Endereco> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}
	
	public String getCategoriaUsuario() {
		return categoria;
	}

	
	
}
