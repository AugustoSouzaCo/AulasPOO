package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Compra;
import negocio.Produto;
import negocio.Tipo;

public class Principal {
	public static void main(String[] args) {
		// Declarations
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Produto objProduto = new Produto();
		Compra objCompra = new Compra();
		
		// Input
		try {
			System.out.println("Digite o nome do produto: ");
			objProduto.setNome(reader.readLine());
			
			System.out.println("Digite o tipo do produto: ");
			objProduto.setTipoProduto(new Tipo(reader.readLine()));
			
			System.out.println("Digite o valor do produto: ");
			objProduto.setPreco(Double.parseDouble(reader.readLine()));
			
			objCompra.setObjProduto(objProduto);
			
			System.out.println("Digite a quantidade de produtos: ");
			objCompra.setQuantidade(Integer.parseInt(reader.readLine()));
			
			System.out.println("Digite a data da compra: ");
			objCompra.setData(reader.readLine());
			
			System.out.println("Digite o número do cartão: ");
			objCompra.setCartao(reader.readLine());
			
		} catch (Exception e) {
			System.out.println("Erro: " + e);
		}
		
		// Output
		System.out.println("NOME DO PRODUTO: " + objCompra.getObjProduto().getNome());
		System.out.println("DESCRIÇÃO: " + objCompra.getObjProduto().getTipoProduto().getDescricao());
		System.out.println("QTDE: " + objCompra.getQuantidade());
		System.out.println("PREÇO: " + objCompra.getObjProduto().getPreco());
		System.out.println("DATA: " + objCompra.getData());
		System.out.println("CARTÃO: " + objCompra.getCartao());
				
	}
}
