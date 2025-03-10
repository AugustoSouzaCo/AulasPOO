package negocio;

public class Produto {
	//Properties
	private String nome = "";
	private double preco = 0;
	private Tipo tipoProduto = null;
	
	//Constructors
	public Produto() {
		super();
	}
	public Produto(String nome, double preco, Tipo tipoProduto) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.tipoProduto = tipoProduto;
	}
	
	//Access
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Tipo getTipoProduto() {
		return tipoProduto;
	}
	public void setTipoProduto(Tipo tipoProduto) {
		this.tipoProduto = tipoProduto;
	}
	
	
}
