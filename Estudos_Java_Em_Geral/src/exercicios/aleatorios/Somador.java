package exercicios.aleatorios;

import java.util.Scanner;

public class Somador{


	public static void main(String[] args){

		Scanner s = new Scanner(System.in);
		System.out.println("Digite seu Somador: ");
		int num = s.nextInt();

		for (int i = 0; i < 10; i++){
			System.out.println(num + " + " + (i + 1) + " = " + (num + (i + 1)));
		}
		s.close();
	}

}
