package com.models;

public class PacienteModel {
	private int id;
	private String cpf, nome, sus, nascimento, email, quadro, descricao;

	public PacienteModel(String cpf, String nome, String sus, String nascimento, String email, String quadro,
			String descricao) {
		this.cpf = cpf;
		this.nome = nome;
		this.sus = sus;
		this.nascimento = nascimento;
		this.email = email;
		this.quadro = quadro;
		this.descricao = descricao;
	}
	
	public PacienteModel() {
		
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
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

	public String getSus() {
		return sus;
	}

	public void setSus(String sus) {
		this.sus = sus;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQuadro() {
		return quadro;
	}

	public void setQuadro(String quadro) {
		this.quadro = quadro;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
