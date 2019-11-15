package br.unitins.cinema.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;

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
		funcionario.setId(3);
		funcionario.setLogin("gab");
		funcionario.setSenha("gab");
		
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
				"O que deseja fazer? 1- Adicionar nova sessão de filme, 2- Remover uma sessão de filme, "
				+ "3- Listar as sessões dos filmes, 4- Alterar sessão de algum filme ");
		int opcao = scan.nextInt();
		if (opcao == 1) {
			System.out.println("Por favor preencha os dados do filme");
			sessao.add(new Sessao(null, opcao, null));
		} else if (opcao == 2) {
			System.out.println("Por favor digite o numero da sessao que quer remover: ");
			int remSessao = scan.nextInt();
			sessao.remove(remSessao);
		} else if (opcao == 3) {
			for (Sessao sessao2 : sessao) {
				System.out.println(sessao2);
			}
		} else if (opcao == 4) {
			System.out.println("Digite o nome do filme, sala e horário da sessão que você quer alterar");
			String escolhaFilme = scan.next();
			int escolhaSala = scan.nextInt();
			String escolhaHora = scan.next();
//			String escolhaFilme = scan.next();
//			sessao.stream().filter(p -> p.getFilme().getNome()==escolhaFilme).forEach(p -> System.out.println(p.getFilme().getNome()));	
//			System.out.println("Da(s) sessão(ões) que apareceram, qual você quer alterar?");
			
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
