package br.unitins.cinema.application;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.unitins.cinema.model.Funcionario;
import br.unitins.cinema.model.Gerente;
import br.unitins.cinema.process.Filme;
import br.unitins.cinema.process.Sessao;

public class Menu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Gerente gerente = new Gerente(0, "Paulo", "09090990", LocalDate.of(1900, 3, 3), 4500.0, "Teste", "Tester");
		Funcionario funcionario = new Funcionario(0, "Pedro", "09090990", LocalDate.of(1900, 3, 3), 4500.0, "Gab",
				"Grab");
		String login;
		String senha;

		System.out.println("Por favor digite 1 para fazer o login e a senha, ou 2 para se cadastrar(Gerente) ");
		int opcao = scan.nextInt();
		if (opcao == 1) {
			System.out.println("Digite seu login: ");
			login = scan.next();
			System.out.println("Digite sua senha: ");
			senha = scan.next();
			if (login.equals(gerente.getLogin()) && senha.equals(gerente.getSenha()))
				menuCinema(1);
			else if (login.equals(funcionario.getLogin()) && senha.equals(funcionario.getSenha()))
				menuCinema(2);
			else
				System.out.println("Dados incorretos");
		} else if (opcao == 2) {
			System.out.println("Para confirmarmos sua identidade por favor digite seu login e senha antigo: ");
			String verificaLogin = scan.nextLine();
			String verificaSenha = scan.nextLine();
			if (verificaLogin.equals(gerente.getLogin()) && verificaSenha.equals(gerente.getSenha())) {
				System.out.println("Digite o novo Login");
				gerente.setLogin(scan.nextLine());
				System.out.println("Digite a nova senha: ");
				gerente.setSenha(scan.nextLine());
				System.out.println("Novos dados cadastrados");
			} else {
				System.out.println("Senha ou Login Incorretos");
			}

		}

	}

	public static void menuCinema(int teste) {
		List<Sessao> sessoes = new ArrayList<Sessao>();
		Filme filme = new Filme();
		LocalTime hora;
		LocalDate dataLan�amento;
		LocalDate dataEncerramento;
		Integer sala;

		Scanner leitor = new Scanner(System.in);
		if (teste == 1) {

			System.out.println("Bem vindo Gerente");
			System.out.println(
					"O que deseja fazer? 1- Adicionar uma nova Sessao, 2- Remover uma Sessao Antiga, 3- Listar Todas as Sess�es");
			int opcao = leitor.nextInt();
			if (opcao == 1) {
				System.out.println("Adicione o nome do filme: ");
				filme.setNome(leitor.next());
				System.out.println("Adicione a produtora do filme: ");
				filme.setProdutora(leitor.next());
				System.out.println("Adicione a sala do filme: ");
				sala = leitor.nextInt();
				System.out.println("Por fim adicione o hor�rio: ");
				System.out.println("Hora: ");
				int Hora = leitor.nextInt();
				System.out.println("Minutos: ");
				int Minutos = leitor.nextInt();
				hora = LocalTime.of(Hora, Minutos);

				sessoes.add(new Sessao(filme, sala, hora));
			}else if(opcao == 2) {
				System.out.println("Digite o numero da Sess�o que vc Deseja Remover");
				sessoes.remove(leitor.nextInt());
			}else {
				System.out.println("Essas s�o as Sess�es cadastradas: ");
				for (Sessao sessao : sessoes) {
					System.out.println(sessao);
				}
			}

		} else {
			System.out.println("Bem vindo Funcionario");
		}

	}

}
