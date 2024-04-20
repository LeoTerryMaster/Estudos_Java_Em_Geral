package DevDojo.poo.orientacaoobjeto.Gassociacao.test;

import DevDojo.poo.orientacaoobjeto.Gassociacao.Jogador;

public class JogadorTest{


	public static void main(String[] args){


		Jogador jogador = new Jogador("Pelé");
		Jogador jogador1 = new Jogador("Ronaldo");
		Jogador jogador2 = new Jogador("CACA");
		Jogador jogador3 = new Jogador("Ronaldinho");

		Jogador[] arrayJogador = {
			jogador,
			jogador1,
			jogador2,
			jogador3};


		for (Jogador jogador4 : arrayJogador){
			jogador4.imprimir();
		}
	}

}
