package XTI.src.lp.arrays.simples;

import java.util.Arrays;

public class ArraysSimples2{

	public static void main(String[] args){


		int[] impares = new int[5];

		impares[0] = 1;
		impares[1] = 2;
		impares[2] = 3;
		impares[3] = 4;
		impares[4] = 5;


		System.out.println("impares.length " + impares.length);
		System.out.println();

		System.out.println("impares[1]  " + impares[1]);
		System.out.println();


		for (int i : impares){
			System.out.println("systema impares " + i);
		}


		System.out.println();

		int i = Arrays.binarySearch(impares, 5);
		System.out.println(" binarysourt = "+i);		
		System.out.println();
		
		Arrays.sort(impares, 4 ,impares.length);
		System.out.println(Arrays.toString(impares));
		
	}


}
