package br.edu.ifpb.esperanca.clubbooks;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TesteClubBook {
	
	@Test
	void  cadastrarUsu() {
		CBook a = null;
		Usuario usuario = new Usuario();
		Usuario u = a.cadastrarUsu(usuario);
		assertNotNull(u);
		assertEquals("", u.getId());
	}
	

	@Test
	void criarGrupo() {
		CBook b = null; 
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>(); 
		Grupo g = b.criarGrupo("Teste e DAW2", usuarios);
		assertNotNull(g);
		assertEquals("Teste e DAW2", g.getNome());
	}
	
	
	@Test
	void  cadastrarEdi() {
		CBook c = null;
		Editora editora = new Editora();
		Usuario usuario = new Usuario();
		Editora e = c.cadastrarEdi(usuario, editora);
		assertNotNull(e);
		assertEquals("", e.getId());
	}
	
	@Test
	void  cadastrarLiv() {
		CBook d = null;
		Usuario usuario = new Usuario();
		Livro livro = new Livro();
		Livro l = d.cadastrarLiv(usuario, livro);
		assertNotNull(l);
		assertEquals("", l.getIsbn());
	}
	
	@Test
	void  cadastrarAut() {
		CBook e = null;
		Usuario usuario = new Usuario();
		Autor autor = new Autor();
		Autor at = e.cadastrarAut(usuario, autor);
		assertNotNull(at);
		assertEquals("", at.getId());
	}
	
		@Test
		void  cadastrarCat() {
			CBook f = null;
			Usuario usuario = new Usuario();
			Categoria categoria = new Categoria();
			Categoria cat = f.cadastrarCat(usuario, categoria);
			assertNotNull(cat);
			assertEquals("", cat.getId());
		}
			
			@Test
			void  cadastrarEx() {
				CBook g = null;
				Usuario usuario = new Usuario();
				Livro livro = new Livro();
				Exemplar ex = g.cadastrarEx(usuario, livro);
				assertNotNull(ex);
				assertEquals("", ex.getId());
	}
			
	
}