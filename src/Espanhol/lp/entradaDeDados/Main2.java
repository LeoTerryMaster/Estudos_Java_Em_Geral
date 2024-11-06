package Espanhol.lp.entradaDeDados;

import java.util.Scanner;

public class Main2{


	public static void main(String[] args){

		Scanner s = new Scanner(System.in);
		System.out.print("Digite o nome: ");

		String nome = s.nextLine();


		System.out.print("Digite sua idade: ");
		int idade = s.nextInt();


		System.err.println("Meu nome é  "+nome +" Minha idade é "+ idade);

		s.close();

	}

}
