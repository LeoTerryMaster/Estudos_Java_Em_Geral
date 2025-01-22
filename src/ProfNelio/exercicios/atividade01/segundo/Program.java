package ProfNelio.exercicios.atividade01.segundo;

import java.util.Locale;
import java.util.Scanner;

import ProfNelio.exercicios.atividade01.segundo.util.Calculator;

public class Program{




	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		Calculator cal = new Calculator();

		System.out.println("Entre com o valor do raio: ");
		double radius = scanner.nextDouble();


		double c = cal.circumference(radius);

		double v = cal.VolumeCalculavel(radius);

		System.out.printf("Curcunference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI : %.2f%n", cal.PI);


		scanner.close();
	}




}