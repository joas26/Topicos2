package br.unitins.topicos2.model;

import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinTable;
import javax.persistence.Transient;

@Entity
public class Instrutor extends DefaultEntity<Instrutor> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5562243774720359747L;

	private String cpf;

	private String nome;

	private char sexo;
	
	@Transient
	private Date dataNascimento;

	private String telefone;

	private String email;

	private String senha;

	private Endereco endereco;
	
	
	private Perfil perfil;
	

	public Instrutor() {


	}


	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}


	@Enumerated(EnumType.STRING)
	public Perfil getPerfil() {
		return perfil;
	}



	public Instrutor(String cpf, String nome, char sexo, Date dataNascimento, String telefone, String email,
			String senha, Endereco endereco, Perfil perfil) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.email = email;
		this.senha = senha;
		this.endereco = endereco;
		this.perfil = perfil;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


}
