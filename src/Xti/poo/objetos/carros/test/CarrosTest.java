package Xti.poo.objetos.carros.test;

import Xti.poo.objetos.carros.Carros;
import Xti.poo.objetos.carros.Motor;

public class CarrosTest{

	public static void main(String[] args){


		Carros fusca = new Carros("Fusca", 130, 1.2, new Motor("F21",1200));
		System.out.println(fusca);
		System.out.println(fusca.motor);


		Carros ferrari = new Carros();
		ferrari.modelo = "Ferrari";
		ferrari.velocidadeMaxima = 349;
		ferrari.segundosDeZeroACem = 3.2;
		System.out.println(ferrari);
		Motor v12 = new Motor();
		v12.tipo = "V12";
		v12.potencia = 660;
		ferrari.motor = v12;
		System.out.println(v12);

	}


}
