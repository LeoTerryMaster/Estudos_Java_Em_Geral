package exercicios.aleatorios;

import java.util.Scanner;

public class Aleatorio3multPlicar{


	public static void main(String[] args){


		Scanner s = new Scanner(System.in);
		System.out.println("Digite seu multplicador: ");
		int num = s.nextInt();

		for (int i = 0; i < 10; i++){
			System.out.println(num + " x " + (i + 1) + " = " + (num * (i + 1)));
		}
		s.close();
	}

}
