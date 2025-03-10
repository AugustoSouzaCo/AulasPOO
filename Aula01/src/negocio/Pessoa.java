package negocio;

public class Pessoa {
	// Atributos da classe
	private String nome;
	private String endereco;
	private String telefone;
	
	// Metodos construtores
	public Pessoa(){
	}
	public Pessoa(String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco= endereco; // parametro do metodo dentro da propriedade
		this.telefone = telefone; // autoreferencia do objeto
	}
	
	// Metodos de acesso da classe
	public String getNome(){
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
