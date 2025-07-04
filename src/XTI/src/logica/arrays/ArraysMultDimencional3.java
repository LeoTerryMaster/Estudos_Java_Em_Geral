package XTI.src.logica.arrays;

import java.util.Random;

public class ArraysMultDimencional3{


	/**
	 * 
	 * Exemplo de Arrays Multidimensionais
	 * * Neste exemplo, criamos um array multidimensional de Strings
	 * * onde cada linha representa um grupo de nomes.
	 * * Utilizamos dois loops aninhados para percorrer cada elemento do array.
	 * * Também mostramos como acessar e modificar elementos específicos do array.
	 * @param args
	 */
	public static void main(String[] args){


		String[] faces = {
			"A",
			"1",
			"2",
			"3",
			"4",
			"5",
			"6",
			"7",
			"8",
			"9",
			"10",
			"J",
			"Q",
			"K"};
		String[] naipes = {
			"Copas",
			"Espadas",
			"Ouros",
			"Paus"};

//		String[][] f = new String[naipes.length][faces.length];
//		System.out.println(f.length);

		System.out.println(faces[0] + " de " + naipes[0]);

		System.out.println();


		for (int i = 0; i < naipes.length; i++){
			for (int j = 0; j < faces.length; j++){
				System.out.print(faces[j] + " de " + naipes[i] + ", ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		Random random = new Random();
		System.out.println("Carta aleatória: " + faces[random.nextInt(faces.length)] + " de " + naipes[random.nextInt(naipes.length)]);
	}

}
