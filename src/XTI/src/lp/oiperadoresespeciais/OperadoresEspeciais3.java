package XTI.src.lp.oiperadoresespeciais;

import java.util.Scanner;

public class OperadoresEspeciais3{


	public static void main(String[] args){


		Scanner s = new Scanner(System.in);

		System.out.print("digite o raio : ");
		double raio = s.nextDouble();


		// Diâmetro 2r
		//		double raio = 10;
		double diametro = 2 * raio;

		System.out.println("diametro " + diametro);


		// Circunferência 2 PI r
		double pi = Math.PI;
		double circunferencia = 2 * pi * raio;

		System.out.println("circunferencia " + circunferencia);


		// Área PI r2OperadoresEspeciais2.java
		double area = pi * (raio * raio);
		System.out.println("área " + area);

		s.close();

	}

}
