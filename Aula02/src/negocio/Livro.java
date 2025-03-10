package negocio;

public class Livro {
	// Atributos da classe
	private String titulo = "";
	private String genero = "";
	private Autor objAutor = null; // Declaar objeto: da o tipo, um nome e declara como null No java funciona sem inicializar.
	
	// Metodos construtores
	public Livro() {
	}
	public Livro(String titulo, String genero, Autor objAutor) {
		this.titulo = titulo;
		this.genero = genero;
		this.objAutor = objAutor;
	}
	
	// Metodos de acesso da classe
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Autor getObjAutor() {
		return objAutor;
	}
	public void setObjAutor(Autor objAutor) {
		this.objAutor = objAutor;
	}
	
}
