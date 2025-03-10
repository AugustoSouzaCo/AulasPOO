package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Autor;
import negocio.Livro;

public class VisaoLivraria {
	public static void main(String[] args) { //bootstrap
		
		// Declaração de variaveis
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Livro objLivro = new Livro();
		
		// Entrada de dados
		try {
			System.out.println("Digite o título do livro");
			objLivro.setTitulo(reader.readLine());
			
			System.out.println("Digite o gênero do livro");
			objLivro.setGenero(reader.readLine());
			
			System.out.println("Digite o nome do autor do livro");
			objLivro.setObjAutor(new Autor(reader.readLine()));
			
		} catch (Exception e) {
			System.out.println("Lascou" + e);
		}
		// Saída de dados
		System.out.println("Título: " + objLivro.getTitulo());
		System.out.println("Gênero: " + objLivro.getGenero());
		System.out.println("Autor: " + objLivro.getObjAutor().getNome());

	}
}
