package br.unitins.cinema.model;

import java.util.Date;

import br.unitins.cinema.autentication.Autenticacao;

public abstract class Pessoa implements Autenticacao {
	private Long id;
	private String nome;
	private String cpf;
	private Date dataNascimento;
	private Double salario;
	private String login;
	private String senha;

	public Pessoa(Long id, String nome, String cpf, Date dataNascimento, Double salario) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.salario = salario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
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
	
	@Override
	public boolean verificaLogin(String login) {
		if(this.login == login)
			return true;
		else
			return false;
	}
	@Override
	public boolean verificaSenha(String senha) {
		if(this.senha == senha)
			return true;
		else
			return false;
	}
	
	public boolean autenticador() {
		if(verificaLogin(login) == true && verificaSenha(senha) == true)
			return true;
		else
			return false;
	}
}
