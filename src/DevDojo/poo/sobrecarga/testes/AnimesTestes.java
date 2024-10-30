package DevDojo.poo.sobrecarga.testes;

import DevDojo.poo.sobrecarga.Animes;

public class AnimesTestes {

    public static void main(String[] args) {
        // Aula de sobre carga de métodos sem construtor
        // Temos vários tipo de sobre cargas


        // objeto sem construtor e sem sobre carga
        Animes animes = new Animes();
        animes.setNome("You You Hakusho");
        animes.setTipo("Anime TV");
        animes.setEpsodios(253);
        animes.imprimir();

        System.out.println();

        // objeto sem construtor sem sobre carga e com métodos de inicialização
        Animes animes1 = new Animes();
        animes1.init("Alkimia", "Anime TV", 300);
        animes1.imprimir();


        // objeto sem construtor com sobre carga com método de inicialização
        Animes animes2 = new Animes();
        animes2.init("Alkimia", "Anime TV", 300, "Akimia Anime");
        animes2.imprimir();

    }
}
