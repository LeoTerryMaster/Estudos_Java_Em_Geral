package ProfNelio.lp.debug;

import java.util.Locale;
import java.util.Scanner;

public class Main{


	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		double largura = s.nextDouble();
		double comprimento = s.nextDouble();
		double metroQuadrado = s.nextDouble();


		double area = largura * comprimento;
		double preco = area * metroQuadrado;

		System.out.printf("Area = %.2f%n", area);
		System.out.printf("Area = %.2f%n", preco);

		s.close();

	}

}
