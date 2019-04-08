package br.edu.ifpb.esperanca.clubbook;

import java.sql.Date;

public class Venda {
	
	private Long id;
	private Date data;
	private Double preco;
	private String formaPagamento;
	private String formaEntrega;
	private Exemplar exemplar;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public String getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	public String getFormaEntrega() {
		return formaEntrega;
	}
	public void setFormaEntrega(String formaEntrega) {
		this.formaEntrega = formaEntrega;
	}
	public Exemplar getExemplar() {
		return exemplar;
	}
	public void setExemplar(Exemplar exemplar) {
		this.exemplar = exemplar;
	}
	
	
	

}
