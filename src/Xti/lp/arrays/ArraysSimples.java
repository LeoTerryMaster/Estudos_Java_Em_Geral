package Xti.lp.arrays;

import java.util.Arrays;

public class ArraysSimples{

	public static void main(String[] args){


		String[] paises = {
			"Brasil",
			"França",
			"Russia",
			"Estados Unidos",
			"Belgica"};

		System.out.println("Primeira posição : " + paises[0]);

		System.out.println("Arrays classe : " + Arrays.toString(paises));


		System.out.println("Arrays classe BinarySearch: " + Arrays.binarySearch(paises, "Brasil"));

		System.out.println("Números de psições : " + paises.length);

		for (String p : paises){
			System.out.print("foreach : " + p + ", ");
		}

		for (int i = 0; i < paises.length; i++){
			System.out.println("for simples : " + paises[i]);
		}
		System.out.println();
		Arrays.sort(paises, 2, paises.length);
		System.out.println("Arrays classe  ordenada : " + Arrays.toString(paises));
		System.out.println();


		Double[] valores = {
			15.25,
			25.98,
			30.21,
			88.9};

		System.out.println(valores[2].doubleValue());

	}

}
