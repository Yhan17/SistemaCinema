package br.unitins.cinema.process;

import java.time.LocalTime;


public class Sessao {
	private Integer idSessao;
	private Filme filme;
	private Integer sala ;
	private LocalTime horarios;
	


	public Sessao(Integer idSessao, Filme filme, Integer sala, LocalTime horarios) {
		this.idSessao = idSessao;
		this.filme = filme;
		this.sala = sala;
		this.horarios = horarios;
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public Integer getSala() {
		return sala;
	}

	public void setSala(Integer sala) {
		this.sala = sala;
	}

	public LocalTime getHorarios() {
		return horarios;
	}

	public void setHorarios(LocalTime horarios) {
		this.horarios = horarios;
	}

	public Integer getIdSessao() {
		return idSessao;
	}

	public void setIdSessao(Integer idSessao) {
		this.idSessao = idSessao;
	}

	@Override
	public String toString() {
		return "Sessao [idSessao=" + idSessao + ", filme=" + filme + ", sala=" + sala + ", horarios=" + horarios + "]";
	}

	
	

	
	
}
