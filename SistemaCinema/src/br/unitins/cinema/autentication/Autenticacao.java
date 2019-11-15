package br.unitins.cinema.autentication;

public interface Autenticacao {
	
	boolean verificaSenha(String senha);
	boolean verificaLogin(String login, Long id);
	
}
