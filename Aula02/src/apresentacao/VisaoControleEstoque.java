package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Estante;
import negocio.Produto;

public class VisaoControleEstoque {
	public static void main(String[] args) {
		// Variaveis
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		Produto objProduto= new Produto();
		
		//Entrada
		try {
			System.out.println("Digite o nome do produto");
			objProduto.setNome(rd.readLine());
			
			System.out.println("Digite a quantidade do produto");
			objProduto.setQuantidade(Integer.parseInt(rd.readLine())); // transforma o readline em int; não da pra fazer casting de tipos que não são parecidos
			
			System.out.println("Digite o número da estante do produto");
			objProduto.setObjEstante(new Estante(Integer.parseInt(rd.readLine())));
	
		} catch (Exception e){
			System.out.println("Fondue" + e);
		}
		// Saida
		System.out.println("Produto: " + objProduto.getNome());
		System.out.println("Quantidade: " + objProduto.getQuantidade());
		System.out.println("Estante: " + objProduto.getObjEstante().getNumero());
	}
}
