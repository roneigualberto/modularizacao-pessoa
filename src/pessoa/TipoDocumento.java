package pessoa;

public enum TipoDocumento {
	
	CPF("CPF", "Cadastro de Pessoas Físicas");
	
	private TipoDocumento(String descricao, String nome) {
		this.descricao = descricao;
		this.nome = nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	private String descricao;
	private String nome;

}
