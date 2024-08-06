package DevDojo.poo.blocoinicializacao.testes;

import DevDojo.poo.blocoinicializacao.Anime;

public class Testes {


    public static void main(String[] args) {
        Anime a = new Anime("You You Hakusho");
        System.out.println();


        for (int ep : a.getEpsodios()) {
            System.out.print(ep + " ");
        }

    }
}
