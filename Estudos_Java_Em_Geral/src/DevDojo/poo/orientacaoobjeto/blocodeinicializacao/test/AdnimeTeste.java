package DevDojo.poo.orientacaoobjeto.blocodeinicializacao.test;

import DevDojo.poo.orientacaoobjeto.blocodeinicializacao.Anime;

public class AdnimeTeste{


	public static void main(String[] args){

		Anime anime = new Anime();


		for (int a : anime.getEpsodios()){
			System.out.print(a + " ");
		}

	}

}
