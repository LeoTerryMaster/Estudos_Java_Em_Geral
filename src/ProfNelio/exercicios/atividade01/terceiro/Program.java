package ProfNelio.exercicios.atividade01.terceiro;

import java.util.Locale;
import java.util.Scanner;

import ProfNelio.exercicios.atividade01.terceiro.util.Calculator;


public class Program{




	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.println("Entre com o valor do raio: ");
		double radius = scanner.nextDouble();


		double c = Calculator.circumference(radius);

		double v = Calculator.VolumeCalculavel(radius);

		System.out.printf("Curcunference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI : %.2f%n", Calculator.PI);


		scanner.close();
	}




}