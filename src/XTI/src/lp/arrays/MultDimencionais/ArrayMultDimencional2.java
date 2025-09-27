package XTI.src.lp.arrays.MultDimencionais;

import java.util.Random;

public class ArrayMultDimencional2{


	public static void main(String[] args){

		String[] faces = {
			"A",
			"2",
			"3",
			"4",
			"5",
			"6",
			"7",
			"8",
			"9",
			"10",
			"Valete",
			"Dama",
			"Reis"};
		String[] nimes = {
			"Espadas",
			"Paus",
			"Copas",
			"Ouros",};


		Random r = new Random();

		String cartas = faces[r.nextInt(faces.length)] + " " + nimes[r.nextInt(nimes.length)];
		System.out.println(cartas);

	}

}
