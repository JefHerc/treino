package com.algaworks.festa.model;

public class Convidado {

	private int id;
	private String nome;

	private Integer quantidadeAcompanhantes;

	public Convidado(int id, String nome, Integer quantidadeAcompanhantes) {
		this.id = id;
		this.nome = nome;
		this.quantidadeAcompanhantes = quantidadeAcompanhantes;
	}

	public Convidado() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidadeAcompanhantes() {
		return quantidadeAcompanhantes;
	}

	public void setQuantidadeAcompanhantes(Integer quantidadeAcompanhantes) {
		this.quantidadeAcompanhantes = quantidadeAcompanhantes;
	}

	@Override
		public String toString() {
			return String.format("Id: %d, Nome: %s, Qtd: %d", this.id, this.nome, this.quantidadeAcompanhantes);
		}
}
