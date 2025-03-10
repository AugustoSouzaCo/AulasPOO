package negocio;

public class Estante {
	// Propriedades da classe
	private int numero = 0;
	
	// Construtores
	public Estante() {
	}
	public Estante(int numero) {
		this.numero = numero;
	}
	
	// Acesso
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
