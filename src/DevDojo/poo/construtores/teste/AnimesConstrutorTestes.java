package DevDojo.poo.construtores.teste;

import DevDojo.poo.construtores.AnimesConstrutor;

public class AnimesConstrutorTestes {

    public static void main(String... args) {


        AnimesConstrutor animes= new AnimesConstrutor("You You Hakusho","Anime Tvs",300,"Mangar");
        animes.imprimir();


        AnimesConstrutor animes2= new AnimesConstrutor("You You Hakusho","Anime Tvs",300,"Mangar","MultVerso");
        animes2.imprimir();
    }


}
