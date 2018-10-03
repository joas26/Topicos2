package br.unitins.topicos2.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
public class Aluno extends DefaultEntity<Aluno> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2285939380429834146L;

	
	private Date dataNascimento;
	
	private Integer id;
	private String nome;
	private String cpf;
	private String telefone;
	private String email;
	private String senha;
	
	
	public Aluno() {
		
	}
	
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
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
	
}
