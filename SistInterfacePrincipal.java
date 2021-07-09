package br.timmers;

import java.util.List;

public interface SistInterfacePrincipal {

	boolean estahCadastrado(String cpf);

	boolean cadastrarUsuario(String nome, int idade, String cpf, String email, CategoriaUsuario categoria);

	boolean cadastrarPromoter(String nome, int idade, String cpf, String email, CategoriaUsuario categoria,
			String cnpj);
	
	boolean cadastrarLocador(String nome, int idade, String cpf, String email, CategoriaUsuario categoria,
			List<Endereco> endereco);
	
	List<Locador> pesquisarLocador(String nome, int idade, String cpf, String email, CategoriaUsuario categoria,
			List<Endereco> endereco);

	CategoriaUsuario getCategoriaUsuario(CategoriaUsuario categoria);

	List<Usuario> getUsuarios();

	void setUsuarios(List<Usuario> usuarios);

	List<Promoter> getPromoters();

	void setPromoters(List<Promoter> promoters);

	List<Locador> getLocadores();

	void setLocadores(List<Locador> locadores);

	

	

}