package ProfNelio.poo.appication.sempoo;

import java.util.Locale;
import java.util.Scanner;

public class Program{


	public static void main(String[] args){

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC;

		System.out.println("Entre o número do triângulo... X ");
		xA = scanner.nextDouble();
		xB = scanner.nextDouble();
		xC = scanner.nextDouble();

		System.out.println("Entre o número do triângulo... Y ");
		yA = scanner.nextDouble();
		yB = scanner.nextDouble();
		yC = scanner.nextDouble();

		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));


		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));


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
