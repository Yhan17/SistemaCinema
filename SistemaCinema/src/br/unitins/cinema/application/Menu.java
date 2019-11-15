package br.unitins.cinema.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.unitins.cinema.model.Funcionario;
import br.unitins.cinema.model.Gerente;
import br.unitins.cinema.process.Sessao;

public class Menu {

	static List<Sessao> sessao = new ArrayList<Sessao>();
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		String senha = " ";
		String login = " ";
		Integer id;
		
		Gerente gerente = new Gerente(0, "teste", "tester", null, null);
		gerente.setId(0);
		gerente.setLogin("teste");
		gerente.setSenha("tester");
		Funcionario funcionario = new Funcionario(1, "teste", "123", null, null, "fdas");
		funcionario.setId(1);
		funcionario.setLogin("tester");
		funcionario.setSenha("teste");
		
		System.out.println("Por favor Digite seu id ");
		id = leitor.nextInt();
		System.out.println("Agora preencha seu login");
		login = leitor.next();
		System.out.println("Por fim sua senha");
		senha = leitor.next();
		if (gerente.preencherDados(login, senha, id) == true)
			menuGerente();
		else if (funcionario.preencherDados(login, senha, id) == true)
			menuFuncionario();
		else
			System.out.println("Dados incorretos");

	}

	public static void menuGerente() {
		System.out.println("Bem vindo Gerente");
		System.out.println(
				"O que deseja fazer? 1- Adicionar nova sessão de filme, 2- Remover uma sessão de filme, 3- Listar as sessões dos filmes, ");
		int opcao = scan.nextInt();
		if (opcao == 1) {
			System.out.println("Por favor preenhca os dados do filme");
			sessao.add(new Sessao(null, opcao, null));
		} else if (opcao == 2) {
			System.out.println("Por favor digite o numero da sessao que quer remover: ");
			int remSessao = scan.nextInt();
			sessao.remove(remSessao);
		} else {
			for (Sessao sessao2 : sessao) {
				System.out.println(sessao2);
			}
		}
	}

	public static void menuFuncionario() {
		System.out.println("Bem vindo Funcionario");
		System.out.println("Deseja listar os filmes? 1- Listar filmes: ");
		int opcao = scan.nextInt();
		if (opcao == 1) {
			for (Sessao sessao2 : sessao) {
				System.out.println(sessao2);
			}
		}

	}

}
