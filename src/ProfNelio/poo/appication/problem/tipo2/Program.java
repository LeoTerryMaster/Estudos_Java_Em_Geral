package ProfNelio.poo.appication.problem.tipo2;

import java.util.Locale;
import java.util.Scanner;

import ProfNelio.poo.appication.problem.tipo3.Calculars;

public class Program{




	public static void main(String[] args){

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
	
		
		
		System.out.print("Entre com Raius: ");

		double radius = scanner.nextDouble();

		double c = Calculars.circumference(radius);

		double v = Calculars.volume(radius);

		System.out.printf("Circunference : %.2f%n", c);
		System.out.printf("Volume : %.2f%n", v);
		System.out.printf("Value PI : %.2f%n", Calculars.PI);


		scanner.close();


	}



}
