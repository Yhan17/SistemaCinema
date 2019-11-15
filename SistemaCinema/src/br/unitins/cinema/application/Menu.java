package br.unitins.cinema.application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;

import br.unitins.cinema.model.Funcionario;
import br.unitins.cinema.model.Gerente;
import br.unitins.cinema.process.Categoria;
import br.unitins.cinema.process.Filme;
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
			
				
				System.out.println("Escolha a categoria do filme:");
				System.out.println("1 - Ação \n 2 - Comédia \n 3 - Drama \n 4 - Ficção \n 5 - Terror");
				String escolhaCategoria = scan.next();
				
				System.out.println("Escolha o nome do filme:");
				String escolhaNome = scan.next();
				
				System.out.println("Digite o nome da produtora");
				String escolhaProdutora = scan.next();
				
				System.out.println("Digite o dia, mes e ano de lançamento:");
				int escolhaDiaLancamento = scan.nextInt();
				int escolhaMesLancamento = scan.nextInt();
				int escolhaAnoLancamento = scan.nextInt();
				
				System.out.println("Digite o dia, mes e ano de encerramento:");
				int escolhaDiaEncerramento = scan.nextInt();
				int escolhaMesEncerramento = scan.nextInt();
				int escolhaAnoEncerramento = scan.nextInt();
	
				System.out.println("Digite o numero da sala:");
				int escolhaSala = scan.nextInt();
				
				System.out.println("Informe o dia, mes, ano, hora e minuto da sessão:");
				int escolhaDiaSessao = scan.nextInt();
				int escolhaMesSessao = scan.nextInt();
				int escolhaAnoSessao = scan.nextInt();
				int escolhaHoraSessao = scan.nextInt();
				int escolhaMinutoSessao = scan.nextInt();
				
				
				sessao.add(new Sessao (new Filme(Categoria.valueOf(escolhaCategoria), escolhaNome, escolhaProdutora,
						null,null), escolhaSala, null ) );
				sessao.get(0).getFilme().setDataLancametno(escolhaDiaLancamento, escolhaMesLancamento, escolhaMesLancamento);
				sessao.get(0).getFilme().setDataEncerramento(escolhaDiaEncerramento, escolhaMesEncerramento, escolhaAnoEncerramento);
				sessao.get(0).setHorarios(escolhaDiaSessao, escolhaMesSessao, escolhaAnoSessao, escolhaHoraSessao, escolhaMinutoSessao);
				System.out.println(sessao);
			
				
				
				System.out.println(sessao);
			
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
			//E agora pra alterar um elemento da lista??
			
			
			
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
