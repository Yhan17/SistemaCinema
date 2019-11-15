package br.unitins.cinema.process;

import java.time.LocalTime;


public class Sessao {
	private Filme filme;
	private Integer sala ;
	private LocalTime horarios;
	

	public Sessao(Filme filme, Integer sala, LocalTime horarios) {
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

	@Override
	public String toString() {
		return "Sessao [filme=" + filme + ", sala=" + sala + ", horarios=" + horarios + "]";
	}

	

	
	
}
