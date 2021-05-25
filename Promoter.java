package br.timmers;

public abstract class Promoter extends Usuario{
	
	private int cnpj;

	public Promoter(String nome, int idade, String cpf, String email, int cnpj) {
		super(nome, idade, cpf, email);
		this.cnpj = cnpj;
	}

	public int getCnpj(int cnpj) {
		return this.cnpj;
	}
	
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	

}
