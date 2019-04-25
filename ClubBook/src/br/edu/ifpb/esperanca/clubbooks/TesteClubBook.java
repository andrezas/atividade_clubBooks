package br.edu.ifpb.esperanca.clubbooks;

import org.junit.jupiter.api.Test;

class TesteClubBook {

	@Test
	void criarGrupo() {
		MeuProjetoTeste m; 
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>
		Grupo g = m.criarGrupo("Teste e DAW2", usuarios);
		assertNotNull(g);
		assertEquals("Teste e DAW2", g.getNomeGrupo());
	}
	
	@Test
	void cadastrarLiv() {
		MeuProjetoTeste b; 
		Livro livro = new Livro
		Livro l = b.cadastrarLiv("SCRUM", livro);
		assertNotNull(l);
		assertEquals("SCRUM", l.getTitulo());
	}
}