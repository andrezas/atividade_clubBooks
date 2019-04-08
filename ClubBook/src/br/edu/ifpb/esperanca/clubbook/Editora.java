package br.edu.ifpb.esperanca.clubbook;

import java.sql.Date;

public class Editora {
	
	private Long id;
	private String nome;
	private String fundador;
	private Date fundacao;
	private String sede;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFundador() {
		return fundador;
	}
	public void setFundador(String fundador) {
		this.fundador = fundador;
	}
	public Date getFundacao() {
		return fundacao;
	}
	public void setFundacao(Date fundacao) {
		this.fundacao = fundacao;
	}
	public String getSede() {
		return sede;
	}
	public void setSede(String sede) {
		this.sede = sede;
	}
	
	
	
}
