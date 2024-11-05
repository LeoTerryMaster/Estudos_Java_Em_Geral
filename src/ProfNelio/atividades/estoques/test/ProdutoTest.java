package ProfNelio.atividades.estoques.test;

import java.util.Locale;
import java.util.Scanner;

import ProfNelio.atividades.estoques.Produto;

public class ProdutoTest{

	public static void main(String[] args){


		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);


		Produto produto = new Produto();
		System.out.println("Escreva:");
		System.out.print("Nome: ");
		produto.nome = s.nextLine();

		System.out.print("Preço: ");
		produto.prince = s.nextDouble();

		System.out.print("Quantidade: ");
		produto.quantidade = s.nextInt();

		System.out.println();
		produto.imprimir();

		System.out.println();
		System.out.println(produto);

		System.out.println();

		System.out.print("Esqueva a quantidade para adicional: ");
		int quantidade = s.nextInt();
		produto.add(quantidade);


		System.out.println();
		produto.imprimir();

		System.out.println();
		System.out.println(produto);


		System.out.println();

		System.out.print("Esqueva a quantidade para remover: ");
		quantidade = s.nextInt();
		produto.add(quantidade);


		System.out.println();
		produto.imprimir();

		System.out.println();
		System.out.println(produto);
		s.close();


	}

}
