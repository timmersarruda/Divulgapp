package br.timmers;

public class Endereco {

	private String rua;
	private int numeroDaCasa;
	private String cidade;
	public String estado;
	public int cep;
	
	public Endereco(String rua, int numeroDaCasa,String cidade, String estado, int cep) {
		this.rua = rua;
		this.numeroDaCasa = numeroDaCasa;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}
}
