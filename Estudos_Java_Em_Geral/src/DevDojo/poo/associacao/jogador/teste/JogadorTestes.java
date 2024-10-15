package DevDojo.poo.associacao.jogador.teste;

import DevDojo.poo.associacao.jogador.Jogador;

public class JogadorTestes {


    public static void main(String[] args) {

    Jogador jogador = new Jogador("Pelé");
    Jogador jogador1 = new Jogador("Ronaldo");
    Jogador jogador2 = new Jogador("Ronaldinho");

    Jogador[] jogadores = {jogador,jogador1,jogador2};

        for (Jogador s: jogadores){
            s.imprimir();
        }
    }

}
