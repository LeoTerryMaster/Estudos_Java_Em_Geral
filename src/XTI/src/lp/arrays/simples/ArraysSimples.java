package XTI.src.lp.arrays.simples;

import java.util.Arrays;

public class ArraysSimples{

	public static void main(String[] args){


		String[] paises = {
			"Brasil",
			"Russia",
			"Argentina",
			"Bulgaria",
			"Finlandia",
			"China"};


		System.out.println("indice  = paises[0]  " + paises[0]);
		System.out.println();
		System.out.println(" Arrays.toString() " + Arrays.toString(paises));
		System.out.println();

		for (String p : paises){

			System.out.println("Paísis = " + p);
		}

	}


}
