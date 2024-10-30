package ProfNelio.lp.WhilesDowhile;

import java.util.Locale;
import java.util.Scanner;

public class Main3{


	public static void main(String[] args){

		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		char resp;
		do{
			System.out.print("Digite a temperatura em Celsius :");


			double c = s.nextDouble();
			double f = 9.0 * c / 5.0 + 32.0;

			System.out.printf("Equivalente a Fahrenheit: %.1f%n", f);
			System.out.print("Deseja repetir (s/n) ? :");
			resp = s.next().charAt(0);
		}while(resp != 'n');


		s.close();


	}


}
