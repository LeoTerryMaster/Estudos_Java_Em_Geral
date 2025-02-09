package ProfNelio.poo.appication.problem.tipo3;

import java.util.Locale;
import java.util.Scanner;

public class Program{

	public static double PI = 3.14159;


	public static void main(String[] args){

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.print("Entre com Raius: ");

		double radius = scanner.nextDouble();

		double c = circumference(radius);

		double v = volume(radius);

		System.out.printf("Circunference : %.2f%n", c);
		System.out.printf("Volume : %.2f%n", v);
		System.out.printf("Value PI : %.2f%n", PI);


		scanner.close();


	}


	public static double circumference(double radius){
		return 2.0 * PI * radius;
	}

	public static double volume(double radius){
		return 4.0 * PI * radius * radius * radius / 3.0;
	}

}
