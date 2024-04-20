package DevDojo.poo.orientacaoobjeto.Gassociacao2.test;

import DevDojo.poo.orientacaoobjeto.Gassociacao2.Jogador;
import DevDojo.poo.orientacaoobjeto.Gassociacao2.Time;

public class JogadorTest{


	public static void main(String[] args){


		Time time = new Time("Selecao Brasileira");

		Jogador jogador = new Jogador("Pelé", time);
		Jogador jogador1 = new Jogador("Ronaldo",time);
		Jogador jogador2 = new Jogador("CACA",time);
		Jogador jogador3 = new Jogador("Ronaldinho",time);

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
