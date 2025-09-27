package XTI.src.lp.arrays.arraylist;

import java.util.ArrayList;

public class ArrayLists{


	public static void main(String[] args){

		ArrayList<String> cores = new ArrayList<>();
		cores.add("Branco");
		cores.add("Vermelho");
		cores.add("Amarelo");
		cores.add("Azul");
		cores.add("Maron");


		System.out.println("Quantos elementos tem = cores.toString()  :" + cores.toString());
		System.out.println("Total de elemtnos = cores.size() :" + cores.size());
		System.out.println("retorna o índice  = cores.get(2) :" + cores.get(2));
		System.out.println("retorna o índice da cor = cores.indexOf(\"Azul\") :" + cores.indexOf("Azul"));

		System.out.println("Será que dentro de cores tem a cor amarelho ? " + cores.contains("Amarelo"));
	}

}
