package br.unitins.cinema.application;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.unitins.cinema.model.Funcionario;
import br.unitins.cinema.model.Gerente;
import br.unitins.cinema.process.Categoria;
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
		int count = 0;
		while (count != 3) {
			System.out.println("Por favor digite 1 para fazer o login e a senha, ou 2 para se cadastrar(Gerente) ");
			int opcao = scan.nextInt();
			if (opcao == 1) {
				System.out.println("Digite seu login: ");
				login = scan.next();
				System.out.println("Digite sua senha: ");
				senha = scan.next();
				if (login.equals(gerente.getLogin()) && senha.equals(gerente.getSenha())) {
					menuCinema(1);
					count = 4;
				} else if (login.equals(funcionario.getLogin()) && senha.equals(funcionario.getSenha())) {
					menuCinema(2);
					count = 4;
				} else {
					System.out.println("Dados incorretos");
					count++;
					System.out.println("Voce tem mais " + (3 - count) + " Tentativas");
				}
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
					count = 4;
				} else {
					System.out.println("Senha ou Login Incorretos");
					count++;
					System.out.println("Voce tem mais " + count + " Tentativas");
				}

			}
		}

	}

	public static void menuCinema(int teste) {
		List<Sessao> sessoes = new ArrayList<Sessao>();
		Filme filme = new Filme();
		LocalTime hora;
		LocalDate dataLançamento;
		LocalDate dataEncerramento;
		Integer sala;
		Integer id = sessoes.size(); // Aqui tem que rever

		Scanner leitor = new Scanner(System.in);
		if (teste == 1) {

			System.out.println("Bem vindo Gerente");
			System.out.println(
					"O que deseja fazer? 1- Adicionar uma nova Sessao, 2- Remover uma Sessao Antiga, 3- Listar Todas as Sessões, 4- Alterar uma sessão, 5- Sair ");
			int opcao = leitor.nextInt();
			while (opcao != 5) {
				if (opcao == 1) {
					System.out.println(
							"Por favor digite a Categoria do filme: 1-Ação, 2-Comédia, 3 Drama, 4-Ficçao, 5-Terror");
					int categoria = leitor.nextInt();
					if (categoria == 1)
						filme.setCategoria(Categoria.ACAO);
					else if (categoria == 2)
						filme.setCategoria(Categoria.COMEDIA);
					else if (categoria == 3)
						filme.setCategoria(Categoria.DRAMA);
					else if (categoria == 4)
						filme.setCategoria(Categoria.FICCAO);
					else if (categoria == 5)
						filme.setCategoria(Categoria.TERROR);
					else
						System.out.println("Dados inválidos");

					System.out.println("Adicione o nome do filme: ");
					filme.setNome(leitor.next());
					System.out.println("Adicione a produtora do filme: ");
					filme.setProdutora(leitor.next());
					System.out.println("Adicione a sala do filme: ");
					sala = leitor.nextInt();
					System.out.println("Por fim adicione o horário: ");
					System.out.println("Hora: ");
					int Hora = leitor.nextInt();
					System.out.println("Minutos: ");
					int Minutos = leitor.nextInt();
					hora = LocalTime.of(Hora, Minutos);
					sessoes.add(new Sessao(id, filme, sala, hora));
					id = sessoes.size();
					System.out.println(
							"O que deseja fazer a seguir? 1- Adicionar uma nova Sessao, 2- Remover uma Sessao Antiga, 3- Listar Todas as Sessões, 4- Alterar uma sessão, 5- Sair ");
					opcao = leitor.nextInt();
				} else if (opcao == 2) {
					System.out.println("Digite o ID da Sessão que vc Deseja Remover");
					System.out.println(sessoes);
					sessoes.remove(leitor.nextInt());
					System.out.println(
							"O que deseja fazer a seguir? 1- Adicionar uma nova Sessao, 2- Remover uma Sessao Antiga, 3- Listar Todas as Sessões, 4- Alterar uma sessão, 5- Sair ");
					opcao = leitor.nextInt();
				} else if (opcao == 3) {
					System.out.println("Essas são as Sessões cadastradas: ");
					System.out.println("");
					for (Sessao sessao : sessoes) {
						System.out.println(sessao);
					}
					System.out.println(
							"O que deseja fazer a seguir? 1- Adicionar uma nova Sessao, 2- Remover uma Sessao Antiga, 3- Listar Todas as Sessões, 4- Alterar uma sessão, 5- Sair ");
					opcao = leitor.nextInt();
				}
			}
		} else {
			System.out.println("Bem vindo Funcionario");
		}

	}

}
