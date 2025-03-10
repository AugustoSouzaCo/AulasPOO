package negocio;

public class Tipo {
	//Properties
	private String descricao = "";
	
	//Constructors
	public Tipo() {
		super();
	}

	public Tipo(String descricao) {
		super();
		this.descricao = descricao;
	}
	
	//Access
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}	
