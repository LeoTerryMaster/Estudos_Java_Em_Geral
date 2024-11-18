package Xti.poo.objetos.matemarica.test;

import Xti.poo.objetos.matemarica.Matematica;

public class MatematicaTest{

	public static void main(String[] args){

		Matematica calculo = new Matematica();
		int resultado = calculo.maior(10, 50);
		System.out.println("Maior é " + resultado);

		int somar = calculo.somar(15, 45);
		System.out.println("A soma de x e y é " + somar);


		int somar2 = calculo.somar(calculo.maior(35, 99), calculo.maior(25, 85));
		System.out.println("A soma entre 2 potência  " + somar2);
	}


}
