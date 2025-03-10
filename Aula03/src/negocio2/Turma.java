package negocio2;

import java.util.ArrayList;
import java.util.Collection;

public class Turma {
	private String letra = "";
	private Professor objProfessor = null;
	private Cadeira objCadeira = null;
	private Collection<Aluno> listaDeAlunos = new ArrayList<Aluno>();
	
	public Turma() {
		super();
	}
	public Turma(String letra, Professor objProfessor, Cadeira objCadeira, Collection<Aluno> listaDeAlunos) {
		super();
		this.letra = letra;
		this.objProfessor = objProfessor;
		this.objCadeira = objCadeira;
		this.listaDeAlunos = listaDeAlunos;
	}

	public void adicionarAluno(Aluno aluno) {
		listaDeAlunos.add(aluno);
	}
	
	public void listarAlunos() {
		for (Aluno objAluno: listaDeAlunos) {
			System.out.println(objAluno.getMatricula() + " | " + objAluno.getNome());
		}
	}
	
	public String getLetra() {
		return letra;
	}
	public void setLetra(String letra) {
		this.letra = letra;
	}
	public Professor getObjProfessor() {
		return objProfessor;
	}
	public void setObjProfessor(Professor objProfessor) {
		this.objProfessor = objProfessor;
	}
	public Cadeira getObjCadeira() {
		return objCadeira;
	}
	public void setObjCadeira(Cadeira objCadeira) {
		this.objCadeira = objCadeira;
	}
	public Collection<Aluno> getListaDeAlunos() {
		return listaDeAlunos;
	}
	public void setListaDeAlunos(Collection<Aluno> listaDeAlunos) {
		this.listaDeAlunos = listaDeAlunos;
	}
	
	
	
}
