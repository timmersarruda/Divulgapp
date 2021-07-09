package br.timmers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SistControleDeUsuarioTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

/*	@Test
	void testSistControleDeUsuario() {
		fail("Not yet implemented");
	}
*/
	@Test
	void testaCadastro() {
		SistInterfacePrincipal sistema = new SistControleDeUsuario();
		assertFalse(sistema.estahCadastrado("123"));
		boolean cadastrou = sistema.cadastrarUsuario("Jõao", 32, "123", "x@y", CategoriaUsuario.ATIVO);
		assertTrue(cadastrou);
	}
}
