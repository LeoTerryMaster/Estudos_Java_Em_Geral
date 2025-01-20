package ProfNelio.poo.produtos;

import java.util.Locale;
import java.util.Scanner;

public class Programas{


	public static void main(String[] args){

		Locale.setDefault(Locale.US);

		Scanner scanner = new Scanner(System.in);
		Produto prod = new Produto();
		System.out.println("Entre com os produtos");
		System.out.print("Nome : ");
		prod.nome = scanner.nextLine();

		System.out.print("Preço: ");
		prod.preco = scanner.nextDouble();

		System.out.print("Qauntidade: ");
		prod.quantidade = scanner.nextInt();


		System.out.println("\n");
		prod.imprimir();


		System.out.print("Entre com mais produto!!");
		int quantidade = scanner.nextInt();
		prod.addProdutos(quantidade);


		System.out.println("\n");
		prod.imprimir();
		System.out.println("Adicionou " + quantidade);

		System.out.println("\n");
		System.out.print("Entre a quantidade para remover!!");
		quantidade = scanner.nextInt();
		prod.removerProdutos(quantidade);


		System.out.println("\n");
		prod.imprimir();
		System.out.println("Removeu " + quantidade);

		scanner.close();

	}

}
