package XTI.src.logica.Arrays;

import java.util.Arrays;

public class ArraySimples{


	public static void main(String[] args){

		String[] nomes = new String[5];
		nomes[0] = "João";
		nomes[1] = "Maria";
		nomes[2] = "José";
		nomes[3] = "Ana";
		nomes[4] = "Pedro";
		for (int i = 0; i < nomes.length; i++){
			System.out.println(nomes[i]);
		}

		System.out.println();

		int posicao = Arrays.binarySearch(nomes, "Pedro");
		System.out.println("Posisão " + posicao);
		System.out.println();

		Arrays.sort(nomes, 0, nomes.length);
			System.out.println("Nomes ordenados:"+ Arrays.toString(nomes));
		
		System.out.println();

		System.out.println("Primeira posição " + nomes[0]);
		System.out.println("Segunda posição " + nomes[1]);
		System.out.println("Terceira posição " + nomes[2]);
		System.out.println("Quarta posição " + nomes[3]);

		System.out.println();
		nomes[4] = "Paulo";

		System.out.println("nova última posição " + nomes[4]);

		System.out.println("Última posição " + nomes[4]);
		System.out.println();

		for (String string : nomes){
			System.out.println(string);
		}

		System.out.println();

		System.out.println("Arrays de nomes = " + Arrays.toString(nomes));




		System.out.println();
		try{
			if(nomes.equals(nomes[5])){
				System.out.println("essa posição não existe");
				return;
			}else{
				System.out.println("Os arrays são diferentes");
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Erro: posição do array não existe.");
		}
	}

}