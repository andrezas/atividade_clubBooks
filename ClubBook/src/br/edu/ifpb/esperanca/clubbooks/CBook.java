package br.edu.ifpb.esperanca.clubbooks;

import java.util.ArrayList;

public interface CBook {
	
	public Usuario cadastrarUsu(Usuario usuario);
	
	public Grupo criarGrupo(String nomeGrupo, ArrayList<Usuario> usuario);
	
	public Editora cadastrarEdi(Usuario usuario, Editora editora);
	
	public Livro cadastrarLiv(Usuario usuario, Livro livro);
	
	public Autor cadastrarAut(Usuario usuario, Autor autor);
	
	public Categoria cadastrarCat(Usuario usuario, Categoria categoria);
	
	public Exemplar cadastrarEx(Usuario usuario, Livro livro);
	
	public void enviarMensagem(Usuario usuario, Usuario usuario2 );
	
	public void enviarMensagem(Usuario usuario, Grupo grupo);
	
	public void curtirPost (Usuario usuario, Venda venda);
	
	public Comentar comentarPost (Usuario usuario, Venda venda);
	
	public Venda cadastrarVenda(Usuario comprador, Usuario vendedor, Exemplar exemplar, Double valor);
	
}
