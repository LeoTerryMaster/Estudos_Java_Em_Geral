package exercicios.aleatorios;

import java.util.Scanner;

public class Multplicador{


	public static void main(String[] args){

		Scanner s = new Scanner(System.in);
		System.out.println("Digite seu Multiplicador: ");
		int resultado = s.nextInt();

		for (int i = 0; i < 10; i++){
			System.out.println(resultado + " x " + (i + 1) + " =" + (resultado * (i + 1)));
		}
		s.close();
	}

}
