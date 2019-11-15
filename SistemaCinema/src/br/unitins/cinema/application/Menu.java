package br.unitins.cinema.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.unitins.cinema.autentication.Autenticacao;
import br.unitins.cinema.model.Funcionario;
import br.unitins.cinema.model.Gerente;
import br.unitins.cinema.process.Sessao;

public class Menu{
	static Gerente gerente;
	static Funcionario funcionario;
	static String senha;
	static String login;
	static Long id;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Sessao> sessao = new ArrayList<Sessao>();
		int opcao = 0;
		gerente.setId(0l);
		gerente.setLogin("teste");
		gerente.setSenha("teste");
		while (opcao != 2) {
			System.out.println("Por favor Digite seu id, seu login e sua senha: ");
			id = scan.nextLong();
			login = scan.next();
			senha = scan.next();
			if(gerente.preencherDados(login, senha, id) == true)
				menuGerente();
			else if(funcionario.preencherDados(login, senha, id) == true)
				menuFuncionario();
				
		}

	}

	public static void menuGerente() {
		
	}
	public static void menuFuncionario() {
		
	}


}
