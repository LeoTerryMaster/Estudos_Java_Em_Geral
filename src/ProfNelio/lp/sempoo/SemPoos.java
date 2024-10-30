package ProfNelio.lp.sempoo;

import java.util.Locale;
import java.util.Scanner;

public class SemPoos{

	public static void main(String[] args){

		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC;

		System.out.println("Enter the measures of triangle X:");

		xA = s.nextDouble();
		xB = s.nextDouble();
		xC = s.nextDouble();

		System.out.println("Enter the measures of triangle Y:");

		yA = s.nextDouble();
		yB = s.nextDouble();
		yC = s.nextDouble();


		double p = (xA + xB + xC) / 2;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

		p = (yA + yB + yC) / 2;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

		System.out.println("Triangle X Area: %.4f%\n" + areaX);
		System.out.println("Triangle Y Area: %.4f%\n" + areaY);


		if(areaX > areaY){
			System.out.println("Maior é a área X");
		}else{
			System.out.println("Maior é a área Y");
		}
		s.close();
	}

}
