package DevDojo.poo.orientacaoobjeto.construtores.test;

import DevDojo.poo.orientacaoobjeto.construtores.Anime;

public class AnimeTest{


	public static void main(String[] args){


		// para construi um construito escrevemos em apenas uma linha com todas as informações 
		// e podemos utilizar a classe sempre que quisermos para contruir qualquer coisa do mesmo tipo 
		// Aqui dentro da classe criamos seu método com seus parâmentos 
		Anime anime = new Anime("Goku Fragon Boll", "TV", 250, "Anime", 200);
		anime.imprimir();


		// todo construtor tem sua vantagem e suas desvantagens 
		// aqui temos várias linhas para construi um construtor de desenho 
		// passando um método vario 
		Anime desenhos = new Anime();
		desenhos.setNome("Samurai Uarios");
		desenhos.setTipo("Rede TV");
		desenhos.setGenero("Anime");
		desenhos.setHoras(522);
		desenhos.imprimir();
	}

}
