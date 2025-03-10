package negocio;

public class Produto {
	//Propriedades
	private String nome = "";
	private int quantidade = 0;
	private Estante objEstante = null;
	
	//Construtores
	public Produto() {
	}

	public Produto(String nome, int quantidade, Estante objEstante) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.objEstante = objEstante;
	}
	//Acesso

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Estante getObjEstante() {
		return objEstante;
	}

	public void setObjEstante(Estante objEstante) {
		this.objEstante = objEstante;
	}
	
	
	
	
}
