package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Pessoa;

public class Visao {
	public static void main(String[] args) {
		// Declaração de variaveis
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		Pessoa pessoa1= new Pessoa();
		Pessoa pessoa2 = new Pessoa("Junior", "Seg AV BL 1400", "61 984048139");
		
		// Entrada de dados
		try {
		System.out.println("Digite o nome da pessoa");
		pessoa1.setNome(rd.readLine());
		
		System.out.println("Digite o endereco da pessoa");
		pessoa1.setEndereco(rd.readLine());

		System.out.println("Digite o telefone da pessoa");
		pessoa1.setTelefone(rd.readLine());

		} catch (Exception e) {}
		
		// Saida de dados
		System.out.printf("""
				DADOS DA PESSOA 1:
				Nome: %s 
				Endereço: %s 
				Telefone: %s \n
				""", pessoa1.getNome(), pessoa1.getEndereco(), pessoa1.getTelefone());
		System.out.printf("""
				DADOS DA PESSOA 2:
				Nome: %s 
				Endereço: %s 
				Telefone: %s 
				""", pessoa2.getNome(), pessoa2.getEndereco(), pessoa2.getTelefone());
	}
}
