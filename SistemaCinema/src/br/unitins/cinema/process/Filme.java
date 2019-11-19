package br.unitins.cinema.process;

import java.time.LocalDate;


public class Filme {
	private Categoria categoria;
	private String nome;
	private String produtora;
	

	
	public Filme(Categoria categoria, String nome, String produtora) {
		super();
		this.categoria = categoria;
		this.nome = nome;
		this.produtora = produtora;
	}



	

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProdutora() {
		return produtora;
	}

	public void setProdutora(String produtora) {
		this.produtora = produtora;
	}



	@Override
	public String toString() {
		return "Filme [categoria=" + categoria + ", nome=" + nome + ", produtora=" + produtora + "]";
	}

}
