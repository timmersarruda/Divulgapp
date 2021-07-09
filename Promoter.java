package br.timmers;

public class Promoter extends Usuario{
	
	String categoria = "PROMOTER";
	private String cnpj;

	public Promoter(String nome, int idade, String cpf, String email, CategoriaUsuario categoria, String cnpj) {
		super(nome, idade, cpf, email, categoria);
		this.cnpj = cnpj;
	}

	public String toString() {
		return "O Promoter com os respectivos dados" + getNome() + getIdade() + getEmail() + getCategoria() + getCnpj();
	}
	
	public String getCnpj() {
		return this.cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getCategoriaUsuario() {
		return categoria;
	}
		

}
