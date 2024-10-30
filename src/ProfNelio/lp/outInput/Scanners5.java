package ProfNelio.lp.outInput;

import java.util.Scanner;

public class Scanners5{


	public static void main(String[] args){


		Scanner s = new Scanner(System.in);
		String s1, s2, s3;

		s1 = s.nextLine();
		s2 = s.nextLine();
		s3 = s.nextLine();

		System.out.println("Dados Digitados: ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);


		s.close();


	}

}
