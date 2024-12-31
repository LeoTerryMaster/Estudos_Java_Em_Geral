package ProfNelio.lp.outInput;

import java.util.Scanner;

public class Scanners{


    public Scanners(String texto) {
    }

    public static void main(String[] args){

		
		Scanner s = new Scanner(System.in);

		System.out.println("Digite número ponto flutuante");

		double resultado = s.nextDouble();

		System.out.println("Você digitou = " + resultado);

		s.close();


	}

}
