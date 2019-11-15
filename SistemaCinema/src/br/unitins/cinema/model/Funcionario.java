package br.unitins.cinema.model;

import java.util.Date;
import java.util.Scanner;

public class Funcionario extends Pessoa {
	private String funcao;

	public Funcionario(Long id, String nome, String cpf, Date dataNascimento, Double salario, String funcao) {
		super(id, nome, cpf, dataNascimento, salario);
		this.funcao = funcao;
	}
	

	public String getFuncao() {
		return funcao;
	}


	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}


	@Override
	public boolean verificaSenha(String senha) {
		if(senha.equals(getSenha()))
			return true;
		else
		return false;
	}

	@Override
	public boolean verificaLogin(String login, Long id) {
		if(login.equals(getLogin()) && id.equals(getId()))
			return true;
		else
		return false;
	}

	public boolean preencherDados(String login, String senha, Long id) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Por favor digite seu login e o seu Id: ");
		login = scan.next();
		System.out.println("Agoras seu ID");
		id = scan.nextLong();
		System.out.println("Por favor digite sua senha: ");
		senha = scan.next();
		scan.close();
		if(verificaLogin(login, id) == true && verificaSenha(senha) == true)
			return true;
		else 
		return false;
		
	}



}
