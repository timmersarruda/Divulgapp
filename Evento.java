package br.timmers;

import java.io.Serializable;

public class Evento implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String nomeDoEvento;
	private String descricaoDoEvento;
	private Endereco localidade;
	private int diaDoEvento;
	private int horarioDoEvento;

	
	public Evento(String nomeDoEvento, String descricaoDoEvento, Endereco localidade, int diaDoEvento, int horarioDoEvento) {
		this.setNomeDoEvento(nomeDoEvento);
		this.setDescricaoDoEvento(descricaoDoEvento);
		this.setLocalidade(localidade);
	}
	
	public String tostring() {
		return ("Evento: "+ this.nomeDoEvento + this.descricaoDoEvento + this.diaDoEvento +this.nomeDoEvento);
	}

	public String getNomeDoEvento() {
		return nomeDoEvento;
	}


	public void setNomeDoEvento(String nomeDoEvento) {
		this.nomeDoEvento = nomeDoEvento;
	}

	public String getDescricaoDoEvento() {
		return descricaoDoEvento;
	}


	public void setDescricaoDoEvento(String descricaoDoEvento) {
		this.descricaoDoEvento = descricaoDoEvento;
	}
	
	public Endereco getLocalidade() {
		return localidade;
	}


	public void setLocalidade(Endereco localidade) {
		this.localidade = localidade;
	}

	public int getHorarioDoEvento() {
		return horarioDoEvento;
	}
	
	public void setHorarioDoEvento(int horarioDoEvento) {
		this.horarioDoEvento = horarioDoEvento;
	}

	public int getDiaDoEvento() {
		return diaDoEvento;
	}

	public void setDiaDoEvento(int diaDoEvento) {
		this.diaDoEvento = diaDoEvento;
	}

	
}
