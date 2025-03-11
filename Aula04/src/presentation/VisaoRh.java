package presentation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import model.Colaborador;
import model.Gerente;

public class VisaoRh {
	public static void main(String[] args) {
		// Dec de variaveis
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		Colaborador objColaborador = null;
		String opcao = "";
		
		// Ent de dados
		try {
			System.out.println("Digite <C> para colaborador ou <G> para gerente: ");
			opcao = leitor.readLine();
			
			if (opcao.equalsIgnoreCase("C")) {
				objColaborador = new Colaborador();
			} else {
				objColaborador = new Gerente();
			}
			
			System.out.println("Digite a matricula: ");
			objColaborador.setMatricula(Integer.parseInt(leitor.readLine()));
			
			System.out.println("Digite o nome: ");
			objColaborador.setNome(leitor.readLine());
			
			System.out.println("Digite o salário: ");
			objColaborador.setSalario(Double.parseDouble(leitor.readLine()));
			
			if (! opcao.equalsIgnoreCase("C")) {
				System.out.println("Digite o bônus: ");
				((Gerente) objColaborador).setBonus(Double.parseDouble(leitor.readLine()));
			}
				
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
		// Saída
		System.out.println("Matrícula: " + objColaborador.getMatricula());
		System.out.println("Nome: " + objColaborador.getNome());
		System.out.println("Salário: " + objColaborador.getSalario());
	}
}
