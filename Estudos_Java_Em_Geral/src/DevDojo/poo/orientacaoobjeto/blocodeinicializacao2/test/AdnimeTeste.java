package DevDojo.poo.orientacaoobjeto.blocodeinicializacao2.test;

import DevDojo.poo.orientacaoobjeto.blocodeinicializacao2.Anime;

public class AdnimeTeste{


	public static void main(String[] args){


		Anime anime = new Anime();
		Anime anime1 = new Anime();
		Anime anime2 = new Anime();


		for (int a : Anime.getEpsodios()){
			System.out.print(a + " ");
		}

	}

}
