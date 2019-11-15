package br.unitins.cinema.model;

import java.util.Date;
import java.util.Scanner;

public class Gerente extends Pessoa{

	public Gerente(Integer id, String nome, String cpf, Date dataNascimento, Double salario) {
		super(id, nome, cpf, dataNascimento, salario);
		// TODO Auto-generated constructor stub
	}
	Scanner scan= new Scanner(System.in);
	@Override
	public boolean verificaSenha(String senha) {
		if(senha.equals(getSenha()))
			return true;
		else
		return false;
	}

	@Override
	public boolean verificaLogin(String login, Integer id) {
		if(login.equals(getLogin()) && id== getId())
			return true;
		else
		return false;
	}

	public boolean preencherDados(String login, String senha, Integer id) {
//		System.out.println("Por favor digite seu login e o seu Id: ");
//		login = scan.next();
//		System.out.println("Agoras seu ID");
//		id = scan.nextInt();
//		System.out.println("Por favor digite sua senha: ");
//		senha = scan.next();
		if(verificaLogin(login, id) == true && verificaSenha(senha) == true)
			return true;
		else 
			return false;
		
	}
	
	
}
