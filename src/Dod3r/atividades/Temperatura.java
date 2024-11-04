package Dod3r.atividades;

public class Temperatura{


	public static void main(String[] args){


		final double FOTOR = 5.0 / 9.0;
		final double AJUSTE = 32;

		double fahrenheit = 86;

		double celsuius = (fahrenheit - AJUSTE) * FOTOR;
		System.out.println("O resultado é : " + celsuius + "ºC.");


		fahrenheit = 150;
		celsuius = (fahrenheit - AJUSTE) * FOTOR;
		System.out.println("O resultado é : " + celsuius + "ºC.");
	}

}
