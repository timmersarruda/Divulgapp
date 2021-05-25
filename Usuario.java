package br.timmers;

public abstract class Usuario {

	private String nome;
	private int idade;
	private String cpf;
	private String email;
	private CategoriaUsuario categoria;
	
	public abstract String getId();
	
	public Usuario(String nome, int idade,String cpf, String email) {		
		this.setNome(nome);
		this.setIdade(idade);
		this.setCpf(cpf);
		this.setEmail(email);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
			
	
	
	
}
