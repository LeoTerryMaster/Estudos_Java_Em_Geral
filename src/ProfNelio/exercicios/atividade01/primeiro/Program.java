package ProfNelio.exercicios.atividade01.primeiro;

import java.util.Locale;
import java.util.Scanner;

public class Program{

	public static final double PI = 3.14159;


	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);


		System.out.println("Entre com o valor do raio: ");
		double radius = scanner.nextDouble();


		double c = circumference(radius);

		double v = VolumeCalculavel(radius);

		System.out.printf("Curcunference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI : %.2f%n", PI);


		scanner.close();
	}


	public static double circumference(double radius){
		return 2.0 * PI * radius;
	}


	public static double VolumeCalculavel(double radius){
		return 4.0 * PI * radius * radius * radius / 3;
	}

}
