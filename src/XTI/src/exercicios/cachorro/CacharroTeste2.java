package XTI.src.exercicios.cachorro;

import java.util.Scanner;

public class CacharroTeste2{


	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Qual o nome do cachorro? ");
		String n = s.nextLine();

		System.out.print("Qual a raça? ");
		String r = s.nextLine();

		System.out.print("Qual o tamanho? ");
		String t = s.nextLine();

		System.out.print("Qual o peso do cachorro? ");
		double p = s.nextDouble();

		
		
		Caachorro cahorro= new Caachorro(n,r,p,t);

		
		System.out.println(cahorro);
		s.close();
		

	}


}
