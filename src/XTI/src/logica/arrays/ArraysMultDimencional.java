package XTI.src.logica.arrays;

public class ArraysMultDimencional{


	public static void main(String[] args){


		String[][] nomes = new String[3][3];
		nomes[0][0] = "João";
		nomes[0][1] = "Maria";
		nomes[0][2] = "José";
		nomes[1][0] = "Ana";
		nomes[1][1] = "Pedro";
		nomes[1][2] = "Paulo";
		nomes[2][0] = "Lucas";
		nomes[2][1] = "Luana";
		nomes[2][2] = "Luan";


		for (int i = 0; i < nomes.length; i++){
			for (int j = 0; j < nomes[i].length; j++){
				System.out.print(nomes[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();

		System.out.println("Primeira posição: " + nomes[0][0]);
		System.out.println("Segunda posição: " + nomes[0][1]);
		System.out.println("Terceira posição: " + nomes[0][2]);

		System.out.println();

		System.out.println("Última posição: " + nomes[2][2]);

		System.out.println();

		for (String[] linha : nomes){
			for (String nome : linha){
				System.out.print(nome + " ");
			}
			System.out.println();
		}
	}

}
