package DevDojo.lp.Arrays;

public class Arrays3{

	public static void main(String[] args){
		/*
		 * Nesta forma de arrays terei que especificar
		 * o valor limite, a guantidade que irei usar no array
		 * */
		int[] idades = new int[3];
		idades[0] = 1;
		idades[1] = 15;
		idades[2] = 31;

		/*
		 * Neste for consigo trazer 2 tipos de valores 
		 * a quantidade de variável
		 * e os vaores das variáveis
		 * */
		for (int i = 0; i < idades.length; i++){
			System.out.println("Quantidade de variavel " + i);

			int j = idades[i];
			System.err.println("Valor da variavel " + j);
			
			System.out.println(idades[i]);
		}


	}

}
