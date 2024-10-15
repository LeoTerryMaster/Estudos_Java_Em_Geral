package Xti.revisao.loo.arrays;

import java.util.Arrays;

public class ArraysSimples{


	public static void main(String[] args){
		String[] paises = {
			"Brasil",
			"Argentina",
			"Canadá",
			"US",
			"Russia"};

		for (String p : paises){
			System.out.println(p);
		}

		System.out.println();

		for (int i = 0; i < paises.length; i++){
			String string = paises[i];
			System.out.print(string + ", ");
		}

		System.out.println("\n");

		System.out.println("Pais na posição 0 é : " + paises[0]);

		System.out.println();

		System.out.println(Arrays.toString(paises));

		System.out.println();

		System.out.println(paises.length);

		int posicao = Arrays.binarySearch(paises, "Canadá");
		System.out.println(posicao);


		Arrays.sort(paises, 3, paises.length);

		System.out.println(Arrays.toString(paises));
	}

}
