package br.unitins.cinema.process;

import java.util.Date;

public class Filme {
	private Categoria categoria;
	private String nome;
	private String produtora;
	private Date dataLancametno;
	private Date dataEncerramento;

	public Filme(Categoria categoria, String nome, String produtora, Date dataLancametno, Date dataEncerramento) {
		super();
		this.categoria = categoria;
		this.nome = nome;
		this.produtora = produtora;
		this.dataLancametno = dataLancametno;
		this.dataEncerramento = dataEncerramento;
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

	public Date getDataLancametno() {
		return dataLancametno;
	}

	public void setDataLancametno(Date dataLancametno) {
		this.dataLancametno = dataLancametno;
	}

	public Date getDataEncerramento() {
		return dataEncerramento;
	}

	public void setDataEncerramento(Date dataEncerramento) {
		this.dataEncerramento = dataEncerramento;
	}

}
