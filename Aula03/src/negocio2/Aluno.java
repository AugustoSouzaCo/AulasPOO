package negocio2;

public class Aluno {
	private int matricula = 0;
	private String nome = "";
	
	public Aluno() {
		super();
	}

	public Aluno(int matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}

	public  int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return this.nome + " | " + this.matricula;
	}
}
