package br.edu.ifpb.esperanca.clubbooks;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Exemplar {
	
	@Id
	private Long id;
	private String estadoFisico;
	private Double preco;
	
	@OneToMany
	private Set<Venda> vendas;
	
	public Exemplar(Long id, String estadoFisico, Double preco, Set<Venda> vendas) {
		super();
		this.id = id;
		this.estadoFisico = estadoFisico;
		this.preco = preco;
		this.vendas = vendas;
	}

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

	public Set<Venda> getVendas() {
		return vendas;
	}

	public void setVendas(Set<Venda> vendas) {
		this.vendas = vendas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estadoFisico == null) ? 0 : estadoFisico.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((preco == null) ? 0 : preco.hashCode());
		result = prime * result + ((vendas == null) ? 0 : vendas.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exemplar other = (Exemplar) obj;
		if (estadoFisico == null) {
			if (other.estadoFisico != null)
				return false;
		} else if (!estadoFisico.equals(other.estadoFisico))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (preco == null) {
			if (other.preco != null)
				return false;
		} else if (!preco.equals(other.preco))
			return false;
		if (vendas == null) {
			if (other.vendas != null)
				return false;
		} else if (!vendas.equals(other.vendas))
			return false;
		return true;
	}
	
	
	
	
	

}
