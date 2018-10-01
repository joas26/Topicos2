package br.unitins.topicos2.model;

import javax.persistence.Entity;

@Entity
public class Equipamento extends DefaultEntity<Equipamento> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 388595563213757106L;


	private String nome;

	private String descricao;

	private String marca;

	public Equipamento(String nome, String descricao, String marca) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.marca = marca;
	}
	
	public Equipamento() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	
	
}
