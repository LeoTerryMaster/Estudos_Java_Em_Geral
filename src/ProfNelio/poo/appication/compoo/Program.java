package ProfNelio.poo.appication.compoo;

import java.util.Locale;
import java.util.Scanner;

public class Program{


	public static void main(String[] args){

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		Triangle x, y;
		x = new Triangle();
		y = new Triangle();


		System.out.println("Entre o número do triângulo... X ");
		x.a = scanner.nextDouble();
		x.b = scanner.nextDouble();
		x.c = scanner.nextDouble();

		System.out.println("Entre o número do triângulo... Y ");
		y.a = scanner.nextDouble();
		y.b = scanner.nextDouble();
		y.c = scanner.nextDouble();


		double areaX = x.area();
		double areaY = y.area();


		System.out.println("\n");

		System.out.printf("Triâgolo X área: %.4f%n", areaX);
		System.out.printf("Triâgolo Y área: %.4f%n", areaY);

		System.out.println("\n");

		if(areaX > areaY){
			System.out.println("Área maior é  X");
		}else{
			System.out.println("Área maior é  Y");
		}


		scanner.close();

	}

}
