package com.models;

public class ProfissionalModel {
	private int id;
	private String login, senha, nome, cpf;

	public ProfissionalModel(String login, String senha, String nome, String cpf) {
		this.login = login;
		this.senha = senha;
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public ProfissionalModel(){
		
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
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
	
	
}
