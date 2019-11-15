package br.unitins.cinema.process;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Filme {
	private Categoria categoria;
	private String nome;
	private String produtora;
	private LocalDate dataLancamento;
	private LocalDate dataEncerramento;

	public Filme(Categoria categoria, String nome, String produtora, LocalDate dataLancamento, LocalDate dataEncerramento) {
		super();
		this.categoria = categoria;
		this.nome = nome;
		this.produtora = produtora;
		this.dataLancamento = dataLancamento;
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

	public LocalDate getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancametno(int dia, int mes, int ano) {
		this.dataLancamento = LocalDate.of(ano, mes, dia);
	}

	public LocalDate getDataEncerramento() {
		return dataEncerramento;
	}

	public void setDataEncerramento(int dia, int mes, int ano) {
		this.dataEncerramento = LocalDate.of(ano, mes, dia);
	}

}
