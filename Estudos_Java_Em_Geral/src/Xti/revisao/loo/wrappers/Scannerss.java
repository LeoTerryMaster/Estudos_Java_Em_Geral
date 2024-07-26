package Xti.revisao.loo.wrappers;

import java.util.Scanner;

public class Scannerss{


	public static void main(String[] args){


		Scanner s = new Scanner(System.in);
		System.out.print("Digite sua mensagem: ");


		String pegar= s.nextLine();
		
		System.out.println("Sim verdade : "+ pegar);
		

		s.close();

		
	}

}
