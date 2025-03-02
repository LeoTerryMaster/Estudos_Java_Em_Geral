package Xti.lp.arrays;

public class ArraysMultDimencional{


	public static void main(String[] args){

		String[][] pessoas = {

			{
				"Ricardo",
				"M",
				"DF"},
			{
				"Sandra",
				"F",
				"MG"},
			{
				"Beatriz",
				"F",
				"DF"},

		};


		System.out.println("Arrays externo : " + pessoas.length);
		System.out.println("Arrays interno : " + pessoas[0].length);


		for (String[] pe : pessoas){
			System.out.print(pe[0] + " ");
		}

		System.out.println();

		for (String[] p : pessoas){
			for (String ps : p){
				System.out.print(ps + " ");
			}
		}

	}

}
