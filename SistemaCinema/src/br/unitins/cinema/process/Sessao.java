package br.unitins.cinema.process;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class Sessao {
	private Filme filme;
	private Integer sala;
	List<Time> horarios = new ArrayList<Time>();

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

	public List<Time> getHorarios() {
		return horarios;
	}

	public void setHorarios(List<Time> horarios) {
		this.horarios = horarios;
	}

}