package br.unitins.topicos2.model;

import java.util.Date;

import javax.persistence.Entity;


@Entity
public class Aluno extends DefaultEntity<Aluno> {

	
	private static final long serialVersionUID = 2285939380429834146L;

	
	
	
	private String nome;
	private String cpf;
	private String telefone;
	private String email;
	private String senha;
	private Date dataNascimento;
	
	public Aluno() {
		
	}
	
	
	
	
	public Aluno(String nome, String cpf, String telefone, String email, String senha, Date dataNascimento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.senha = senha;
		this.dataNascimento = dataNascimento;
	}




	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
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
