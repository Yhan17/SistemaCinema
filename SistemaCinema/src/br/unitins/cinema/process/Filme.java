package br.unitins.cinema.process;

import java.time.LocalDate;


public class Filme {
	private Categoria categoria;
	private String nome;
	private String produtora;
	private LocalDate dataLancametno;
	private LocalDate dataEncerramento;


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

	public LocalDate getDataLancametno() {
		return dataLancametno;
	}

	public void setDataLancametno(LocalDate dataLancametno) {
		this.dataLancametno = dataLancametno;
	}

	public LocalDate getDataEncerramento() {
		return dataEncerramento;
	}

	public void setDataEncerramento(LocalDate dataEncerramento) {
		this.dataEncerramento = dataEncerramento;
	}

	@Override
	public String toString() {
		return "Filme [categoria=" + categoria + ", nome=" + nome + ", produtora=" + produtora + ", dataLancametno="
				+ dataLancametno + ", dataEncerramento=" + dataEncerramento + "]";
	}

}
