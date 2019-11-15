package br.unitins.cinema.autentication;

public interface Autenticacao {
	public String login = "";
	public String senha= " ";
	
	public boolean verificaLogin(String login);
	public boolean verificaSenha(String senha);
	
}
