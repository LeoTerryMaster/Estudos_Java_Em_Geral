package ProfNelio.lp.outInput;

import java.util.Locale;
import java.util.Scanner;

public class Scanners3{


	public static void main(String[] args){

		
		Locale.setDefault(Locale.US);
		
		Scanner s = new Scanner(System.in);

		System.out.print("Digite número ponto flutuante : ");

		String resultado = s.nextLine();

		System.out.println("Você digitou = " + resultado);

		s.close();


	}

}
