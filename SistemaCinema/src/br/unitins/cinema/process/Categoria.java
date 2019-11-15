package br.unitins.cinema.process;


public enum Categoria {
	ACAO(1, "Ação"),COMEDIA(2, "Comédia"),DRAMA(3, "Drama"),FICCAO(4, "Ficção"),TERROR(5, "Terror");
	
	private int codigo;
	private String descricao;
	
	private Categoria(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static Categoria valueOf(int codigo) { // Para seleção da categoria

		if (codigo == 1)
			return Categoria.ACAO;
		else if (codigo == 2)
			return Categoria.COMEDIA;
		else if (codigo == 3)
			return Categoria.DRAMA;
		else if (codigo == 4)
			return Categoria.FICCAO;
		else if (codigo == 5)
			return Categoria.TERROR;
		return null;
	}

	@Override

	public String toString() {

		return getDescricao();
	}
}


	
	

