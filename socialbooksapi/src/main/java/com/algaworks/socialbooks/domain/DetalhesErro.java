package com.algaworks.socialbooks.domain;

public class DetalhesErro {
	
	private String titulo;
	
	private Long status;
	
	private Long tiemspamp;
	
	private String mensagemDesenvolvedor;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Long getStatus() {
		return status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public Long getTiemspamp() {
		return tiemspamp;
	}

	public void setTiemspamp(Long tiemspamp) {
		this.tiemspamp = tiemspamp;
	}

	public String getMensagemDesenvolvedor() {
		return mensagemDesenvolvedor;
	}

	public void setMensagemDesenvolvedor(String mensagemDesenvolvedor) {
		this.mensagemDesenvolvedor = mensagemDesenvolvedor;
	}
	
}
