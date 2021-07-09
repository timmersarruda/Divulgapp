package br.timmers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UsuarioTest {
	
	protected UsuarioTest usuarios;

	UsuarioTest usuarios() {
		return null;
	}

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		this.usuarios = new UsuarioTest();
	}

	@Test
	void testaConstrutorUsuario() {
		Usuario usuario = new Usuario("Timmers",23,"40050060098","timmers.araujo@dcx.ufpb.br",CategoriaUsuario.PROMOTER);
		assertEquals(CategoriaUsuario.PROMOTER, usuario.getCategoria());
	}
	
	@Test
	void testGetCpf() {
		Usuario usuario = new Usuario("Timmers",23,"40050060098","timmers.araujo@dcx.ufpb.br",CategoriaUsuario.PROMOTER);
		assertEquals("40050060098", usuario.getCpf());
	}
	
	@Test
	void testCpfIgual() {
		Usuario usuario = new Usuario("Timmers",23,"40050060098","timmers.araujo@dcx.ufpb.br",CategoriaUsuario.PROMOTER);
		Usuario usuario2 = new Usuario("Timmers",23,"40050060098","timmers.araujo@dcx.ufpb.br",CategoriaUsuario.PROMOTER);
		assertEquals(usuario.getCpf(), usuario2.getCpf());	
	}
	
	
}


