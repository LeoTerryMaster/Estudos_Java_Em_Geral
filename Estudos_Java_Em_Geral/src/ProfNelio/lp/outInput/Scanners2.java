package ProfNelio.lp.outInput;

import java.util.Scanner;

public class Scanners2{


	public static void main(String[] args){

		

		Scanner s = new Scanner(System.in);

		System.out.println("Digite Letras");

		char resultado = s.next().charAt(0);

		System.out.println("Você digitou = " + resultado);

		s.close();


	}

}
