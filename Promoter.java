package br.timmers;

public class Promoter extends Usuario{
	
	String categoria = "PROMOTER";
	private int cnpj;

	public Promoter(String nome, int idade, String cpf, String email, CategoriaUsuario categoria, int cnpj) {
		super(nome, idade, cpf, email, categoria);
		this.cnpj = cnpj;
	}

	public String toString() {
		return "O Promoter com os respectivos dados" + getNome() + getIdade() + getEmail() + getCategoria() + getCnpj(cnpj) +" Foi cadastrado com sucesso!";
	}
	
	public int getCnpj(int cnpj) {
		return this.cnpj;
	}
	
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getCategoriaUsuario() {
		return categoria;
	}
		

}
