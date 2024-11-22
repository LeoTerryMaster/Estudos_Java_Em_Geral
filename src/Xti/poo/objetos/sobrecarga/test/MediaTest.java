package Xti.poo.objetos.sobrecarga.test;

import Xti.poo.objetos.sobrecarga.Medias;

public class MediaTest{


	public static void main(String[] args){

		Medias m = new Medias();
		int resultado = (int) m.media(10, 55);
		System.out.println(resultado);


		resultado = (int) m.media("10", "25");
		System.out.println(resultado);


		resultado = (int) m.media(10, 25, 33, 55, 11, 22, 5555, 95);
		System.out.println(resultado);
	}


}
