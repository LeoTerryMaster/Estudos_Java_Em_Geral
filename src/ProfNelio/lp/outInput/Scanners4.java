package ProfNelio.lp.outInput;

import java.util.Locale;
import java.util.Scanner;

public class Scanners4{


	public static void main(String[] args){

		
		Locale.setDefault(Locale.US);
		
		Scanner s = new Scanner(System.in);

		System.out.println("Digite");

		double resultado = s.nextDouble();

		System.out.println("Você digitou = " + resultado);

		s.close();


	}

}
