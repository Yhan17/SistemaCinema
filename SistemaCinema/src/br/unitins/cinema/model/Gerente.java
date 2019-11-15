package br.unitins.cinema.model;

import java.util.Date;

public class Gerente extends Pessoa{

	public Gerente(Long id, String nome, String cpf, Date dataNascimento, Double salario) {
		super(id, nome, cpf, dataNascimento, salario);
		// TODO Auto-generated constructor stub
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

}
