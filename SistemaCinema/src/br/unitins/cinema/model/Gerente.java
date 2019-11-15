package br.unitins.cinema.model;

import java.util.Date;

public class Gerente extends Pessoa{

	public Gerente(Long id, String nome, String cpf, Date dataNascimento, Double salario) {
		super(id, nome, cpf, dataNascimento, salario);
		// TODO Auto-generated constructor stub
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
