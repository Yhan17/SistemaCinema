package br.unitins.cinema.autentication;

public interface Autenticacao {
	
	public  boolean verificaLogin(String login) ;
	public  boolean verificaSenha(String senha);
	
}
