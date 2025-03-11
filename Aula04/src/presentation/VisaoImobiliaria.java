package presentation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import model.Imovel;
import model.Novo;
import model.Usado;

public class VisaoImobiliaria {
	public static void main(String[] args) {
		// DEC VARIAVEIS
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		Imovel imovel = null;
		int opcao = 0;
		
		// ENT DE DADOS
		try {
			System.out.println("Digite <1> para imóvel novo ou <2> para usado");
			opcao = Integer.parseInt(leitor.readLine());
			
			if (opcao == 1) {
				imovel = new Novo();
			} else {
				imovel = new Usado();
			}
			
			System.out.println("Digite o endereço: ");
			imovel.setEndereco(leitor.readLine());
			System.out.println("Digite a metragem: ");
			imovel.setMetragem(Double.parseDouble(leitor.readLine()));
			System.out.println("Digite o valor");
			imovel.setValor(Double.parseDouble(leitor.readLine()));
			
			if (opcao == 1) {
				System.out.println("Digite o adicional: ");
				((Novo) imovel).setAdicional(Double.parseDouble(leitor.readLine()));
			} else {
				System.out.println("Digite a depreciação: ");
				((Usado) imovel).setDepreciacao(Double.parseDouble(leitor.readLine()));
			}
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
		System.out.println("Endereço: " + imovel.getEndereco());
		System.out.println("Metragem: " + imovel.getMetragem());
		System.out.println("Valor: " + imovel.getValor());
	}
}
