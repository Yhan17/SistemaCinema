package br.unitins.cinema.model;

import java.util.Date;

public class Funcionario extends Pessoa {
	private String funcao;

	public Funcionario(Long id, String nome, String cpf, Date dataNascimento, Double salario, String funcao) {
		super(id, nome, cpf, dataNascimento, salario);
		this.funcao = funcao;
	}
	

	public String getFuncao() {
		return funcao;
	}


	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}


	@Override
	public boolean verificaLogin(String login) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean verificaSenha(String senha) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void setLogin(String login) {
		// TODO Auto-generated method stub
		super.setLogin(login);
	}
	
	@Override
	public void setSenha(String senha) {
		// TODO Auto-generated method stub
		super.setSenha(senha);
	}
	@Override
	public String getLogin() {
		// TODO Auto-generated method stub
		return super.getLogin();
	}
	@Override
	public String getSenha() {
		// TODO Auto-generated method stub
		return super.getSenha();
	}
}
