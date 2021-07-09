package br.timmers;

public class Usuario  {

	private String nome;
	private int idade;
	private String cpf;
	private String email;
	protected CategoriaUsuario categoria;
	
	
	public Usuario(String nome, int idade,String cpf, String email, CategoriaUsuario categoria) {		
		this.setNome(nome);
		this.setIdade(idade);
		this.setCpf(cpf);
		this.setEmail(email);
		this.setCategoria(categoria);
	}
	
	public String toString() {
		return "Usuário com os respectivos dados" + nome + idade + cpf + email + categoria + " Foi cadastrado com sucesso!";
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
			
	public CategoriaUsuario getCategoria() {
		return this.categoria;
	}
	
	public void setCategoria(CategoriaUsuario categoria) {
		this.categoria = categoria;
	}

	
}
