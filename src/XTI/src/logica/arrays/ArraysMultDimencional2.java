package XTI.src.logica.arrays;

public class ArraysMultDimencional2{


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


		String[][] nomes = {
			{
				"João", //0//0
				"Maria", //0//1
				"José"}, //0//2
			{
				"Ana", //1//0
				"Pedro", //1//1
				"Paulo"}, //1
			{
				"Lucas", //2//0
				"Luana", //2//1
				"Luan"}};//2


		for (int i = 0; i < nomes.length; i++){
			for (int j = 0; j < nomes[i].length; j++){
				System.out.print(nomes[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println(nomes[0][2]);

		nomes[1][2] = "Paulo Henrique"; //alterando o nome de Paulo para Paulo Henrique

		System.out.println("" + nomes[1][2]); //imprimindo o nome alterado


	}

}
