package negocio;

public class Compra {
	//Properties
	private String cartao = "";
	private int quantidade = 0;
	private Produto objProduto = null;
	private String data = "";
	
	//Constructors
	public Compra() {
		super();
	}
	public Compra(String cartao, int quantidade, Produto objProduto, String data) {
		super();
		this.cartao = cartao;
		this.quantidade = quantidade;
		this.objProduto = objProduto;
		this.data = data;
	}
	
	//Access
	public String getCartao() {
		return cartao;
	}
	public void setCartao(String cartao) {
		this.cartao = cartao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Produto getObjProduto() {
		return objProduto;
	}
	public void setObjProduto(Produto objProduto) {
		this.objProduto = objProduto;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	
}
