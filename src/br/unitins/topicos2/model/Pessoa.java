package br.unitins.topicos2.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
public class Pessoa implements Serializable {

	private static final long serialVersionUID = 842608579949032521L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) /* id autoincrement*/
	private Integer id;
	
	@Transient
	private Date dataNascimento;
	
	private String nome;
	private String endereco;
	private String email;
	
	public Pessoa(){
		//default
	}
	

	public Pessoa(String nome, String endereco, String email) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
	}



	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	
}
