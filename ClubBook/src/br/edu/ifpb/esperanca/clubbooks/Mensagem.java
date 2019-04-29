package br.edu.ifpb.esperanca.clubbooks;

public class Mensagem {
	
	private int id;
	private Usuario usu1;
	private Usuario usu2;
	private String mensagem;
	private String resposta;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Usuario getUsu1() {
		return usu1;
	}
	public void setUsu1(Usuario usu1) {
		this.usu1 = usu1;
	}
	public Usuario getUsu2() {
		return usu2;
	}
	public void setUsu2(Usuario usu2) {
		this.usu2 = usu2;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public String getResposta() {
		return resposta;
	}
	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((mensagem == null) ? 0 : mensagem.hashCode());
		result = prime * result + ((resposta == null) ? 0 : resposta.hashCode());
		result = prime * result + ((usu1 == null) ? 0 : usu1.hashCode());
		result = prime * result + ((usu2 == null) ? 0 : usu2.hashCode());
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
		Mensagem other = (Mensagem) obj;
		if (id != other.id)
			return false;
		if (mensagem == null) {
			if (other.mensagem != null)
				return false;
		} else if (!mensagem.equals(other.mensagem))
			return false;
		if (resposta == null) {
			if (other.resposta != null)
				return false;
		} else if (!resposta.equals(other.resposta))
			return false;
		if (usu1 == null) {
			if (other.usu1 != null)
				return false;
		} else if (!usu1.equals(other.usu1))
			return false;
		if (usu2 == null) {
			if (other.usu2 != null)
				return false;
		} else if (!usu2.equals(other.usu2))
			return false;
		return true;
	}

	
	

}
