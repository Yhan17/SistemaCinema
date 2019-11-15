package br.unitins.cinema.process;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sessao {
	private Filme filme;
	private Integer sala;
	private  LocalDateTime DataHorarios;

	public Sessao(Filme filme, Integer sala, LocalDateTime DataHorarios) {
		this.filme = filme;
		this.sala = sala;
		this.DataHorarios = DataHorarios;
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

	public LocalDateTime getHorarios() {
		return DataHorarios;
	}
	
	public  void setHorarios(int dia, int mes, int ano, int hora, int minuto) {
		DataHorarios = LocalDateTime.of(ano, mes, dia, hora, minuto);
	}

	@Override
	public String toString() {
		return "Sessao [filme=" + filme + ", sala=" + sala + ", horarios=" + DataHorarios + "]";
	}
	
	
	
}
