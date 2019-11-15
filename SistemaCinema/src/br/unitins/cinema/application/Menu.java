package br.unitins.cinema.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.unitins.cinema.autentication.Autenticacao;
import br.unitins.cinema.model.Funcionario;
import br.unitins.cinema.model.Gerente;
import br.unitins.cinema.process.Sessao;

public class Menu implements Autenticacao {
	static Gerente gerente;
	static Funcionario funcionario;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Sessao> sessao = new ArrayList<Sessao>();
		int opcao = 0;

		while (opcao != 2) {
			System.out.println("Por favor Digite seu login e senha: ");

		}

	}

	@Override
	public boolean verificaLogin(String login) {
		if(gerente.getLogin() == login)
			return true;
		else
		return false;
	}

	@Override
	public boolean verificaSenha(String senha) {
		// TODO Auto-generated method stub
		return false;
	}
}
