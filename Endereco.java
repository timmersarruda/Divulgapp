package br.timmers;

import java.util.List;

public class Endereco {

	private String rua;
	private int numeroDaCasa;
	private String cidade;
	public String estado;
	public int cep;


	private String enderecos;

	
	public Endereco(String rua, int numeroDaCasa,String cidade, String estado, int cep) {
		this.rua = rua;
		this.numeroDaCasa = numeroDaCasa;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}


	
	public String getEndereco() {
		if(this.enderecos.length() == 0) {
			return ("Não existe nenhum local disponível por aqui, tente novamente mais tarde.");
		}else {
			return (this.enderecos);
		}
	}
}
