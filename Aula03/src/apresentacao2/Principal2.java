package apresentacao2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import negocio2.Aluno;
import negocio2.Cadeira;
import negocio2.Professor;
import negocio2.Turma;

public class Principal2 {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Turma objTurma = new Turma();
		Professor objProfessor = new Professor();
		
		try {
			System.out.println("Digite o nome da cadeira: ");
			objTurma.setObjCadeira(new Cadeira(reader.readLine()));
			
			System.out.println("Digite o nome do professor: ");
			objProfessor.setNome(reader.readLine());;
			
			System.out.println("Digite o título do professor: ");
			objProfessor.setTitulo(reader.readLine());
			
			System.out.println("Digite o salário do professor: ");
			objProfessor.setSalario(Double.parseDouble(reader.readLine()));
			
			objTurma.setObjProfessor(objProfessor);
			
			
			do {
				Aluno objAluno = new Aluno();
				
				System.out.println("Digite o nome do aluno: ");
				objAluno.setNome(reader.readLine());
				
				System.out.println("Digite a matrícula do aluno: ");
				objAluno.setMatricula(Integer.parseInt(reader.readLine()));
				
				objTurma.adicionarAluno(objAluno);
				
				System.out.println("Tem mais aluno [S] ou [N] ? ");
			} while (reader.readLine().equalsIgnoreCase("S"));
			
		} catch (Exception e) {
			System.out.println("Erro: " + e);
		}
		
		System.out.println("Cadeira: " + objTurma.getObjCadeira().getNome());
		System.out.println("Professor: " + objTurma.getObjProfessor().getNome());
		objTurma.listarAlunos();
	}
}
