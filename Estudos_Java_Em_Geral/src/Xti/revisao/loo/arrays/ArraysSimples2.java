package Xti.revisao.loo.arrays;

import java.util.Arrays;

public class ArraysSimples2{


	public static void main(String[] args){
		String[] paises = new String[5];
		paises[0] = "Brasil";
		paises[1] = "Argentina";
		paises[2] = "Canadá";
		paises[3] = "US";
		paises[4] = "Rússia";


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

		System.out.println(paises.length);

	}


}
