package br.unitins.cinema.process;


public enum Categoria {
	ACAO(1, "A��o"),COMEDIA(2, "Com�dia"),DRAMA(3, "Drama"),FICCAO(4, "Fic��o"),TERROR(5, "Terror");
	
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
	
	public static Categoria valueOf(int codigo) { // Para sele��o da categoria

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


	
	

