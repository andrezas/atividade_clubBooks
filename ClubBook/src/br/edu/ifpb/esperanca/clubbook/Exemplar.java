package br.edu.ifpb.esperanca.clubbook;

public class Exemplar {
	
	private Long id;
	private String estadoFisico;
	private Double preco;
	private Livro livro;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEstadoFisico() {
		return estadoFisico;
	}
	public void setEstadoFisico(String estadoFisico) {
		this.estadoFisico = estadoFisico;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
	
	

}
