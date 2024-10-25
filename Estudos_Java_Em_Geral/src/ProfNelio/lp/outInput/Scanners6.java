package ProfNelio.lp.outInput;

import java.util.Scanner;

public class Scanners6{


	public static void main(String[] args){


		Scanner s = new Scanner(System.in);
		
		int x;
		String s1, s2, s3;

		x = s.nextInt();
		s.nextLine();
		s1 = s.nextLine();
		s2 = s.nextLine();
		s3 = s.nextLine();

		System.out.println("Dados Digitados: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);


		s.close();


	}

}
