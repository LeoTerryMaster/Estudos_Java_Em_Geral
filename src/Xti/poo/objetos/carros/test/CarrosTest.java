package Xti.poo.objetos.carros.test;

import Xti.poo.objetos.carros.Carros;
import Xti.poo.objetos.carros.Motor;

public class CarrosTest{

	public static void main(String[] args){


		
		// objeto com valores no construtor 
		Carros fusca = new Carros("Fusca", 130, 1.2, new Motor("F21", 1200));
		System.out.println(fusca);
		System.out.println(fusca.motor);


		// Objeto com construtores vazio
		Carros ferrari = new Carros();
		ferrari.modelo = "Ferrari";
		ferrari.velocidadeMaxima = 349;
		ferrari.segundosDeZeroACem = 3.2;
		System.out.println(ferrari);
		Motor v12 = new Motor();
		v12.tipo = "V12";
		v12.potencia = 660;
		ferrari.motor = v12; // adiciona o motor ao carro
		System.out.println(v12);


		
		// terceiro tipo de objeto com valores no construtor
		Carros Koni = new Carros("Koni", 430, 13.1);
		Motor k = new Motor("V8", 1118);
		Koni.motor = k;
		System.out.println(Koni);
		System.out.println(Koni.motor);

	}


}
