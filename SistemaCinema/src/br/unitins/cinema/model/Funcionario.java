package br.unitins.cinema.model;

import java.time.LocalDate;


public class Funcionario extends Pessoa {
	public Funcionario(Integer id, String nome, String cpf, LocalDate dataNascimento, Double salario, String login,
			String senha) {
		super(id, nome, cpf, dataNascimento, salario, login, senha);
		}

	@Override
	public boolean verificaLogin(String login) {
		if(login == getLogin())
			return true;
		else
			return false;		
	}

	@Override
	public boolean verificaSenha(String senha) {
		if(senha == getSenha())
			return true;
		else
			return false;		
	}

}
