package br.timmers;

import java.util.List;

public class Endereco {

	private String rua;
	private int numeroDoLocal;
	private String cidade;
	public String estado;
	public int cep;
	private List<Endereco> endereco;

	
	public Endereco(String rua, int numeroDoLocal,String cidade, String estado, int cep) {
		this.setRua(rua);
		this.setNumeroDoLocal(numeroDoLocal);
		this.setCidade(cidade);
		this.setEstado(estado);
		this.setCep(cep);
	}
	
	
	public String toString() {
		return ("O endereço cadastrado foi: " + getRua() + getNumeroDoLocal() + getCidade() + getEstado() + getCep());
	}
	
	public String getEndereco() {
		return endereco.toString();
	}
	
	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}
	

	public String getRua() {
		return this.rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumeroDoLocal() {
		return this.numeroDoLocal;
	}

	public void setNumeroDoLocal(int numeroDoLocal) {
		this.numeroDoLocal = numeroDoLocal;
	}

	public String getCidade() {
		return this.cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public int getCep() {
		return this.cep;
	}
	
	public void setCep(int cep) {
		this.cep = cep;
	}
	
	public String getEstado() {
		return this.estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}


	public void setEndereco(Endereco localidade, List<Endereco> endereco) {
		this.endereco = endereco;
		
	}
	
	public List<Endereco> pesquisarEnderecos() {
		return endereco;
	}
	
	
	
	
}





