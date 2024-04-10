package DevDojo.poo.orientacaoobjeto.subrecarga.test;

import DevDojo.poo.orientacaoobjeto.subrecarga.Anime;

public class Animetest{


	public static void main(String[] args){


		Anime anime = new Anime();
		anime.init("Akudama Drive", "TV", 12);
//		anime.init("Goku Fragon Boll", "TV", 250, "Anime");
//		anime.init("Goku Fragon Boll", "TV", 250, "Anime", 200);
		anime.imprimir();
	}

}
