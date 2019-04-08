package br.edu.ifpb.esperanca.clubbook;

import java.util.Set;

public class Usuario {
	
	private Long id;
	private String nome;
	private String email;
	private String dataNascimento;
	private String endereco;
	private String senha;
	private Set<Venda> vende;
	private Set<Venda> compra;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Set<Venda> getVende() {
		return vende;
	}
	public void setVende(Set<Venda> vende) {
		this.vende = vende;
	}
	public Set<Venda> getCompra() {
		return compra;
	}
	public void setCompra(Set<Venda> compra) {
		this.compra = compra;
	}
	
	

}
