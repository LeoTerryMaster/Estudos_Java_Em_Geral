package ProfNelio.atividades.estoques.test;

import java.util.Locale;
import java.util.Scanner;

import ProfNelio.atividades.estoques.Produto;

public class ProdutoTest{

	public static void main(String[] args){


		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);


		Produto produto = new Produto();
		System.out.print("Escreva o nome ");
		produto.nome = s.nextLine();

		System.out.print("Escreva o valor do produto ");
		produto.prince = s.nextDouble();

		System.out.print("Escreva a quantidade ");
		produto.quantidade = s.nextInt();
		
		produto.imprimir();
		
		
		
		s.close();


	}

}
