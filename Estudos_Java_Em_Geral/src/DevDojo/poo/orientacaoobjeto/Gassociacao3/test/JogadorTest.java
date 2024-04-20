package DevDojo.poo.orientacaoobjeto.Gassociacao3.test;

import DevDojo.poo.orientacaoobjeto.Gassociacao3.Jogador;
import DevDojo.poo.orientacaoobjeto.Gassociacao3.Time;

public class JogadorTest{


	public static void main(String[] args){


		Time time = new Time("Selecao Brasileira");

		Jogador jogador = new Jogador("Pelé", time);
		Jogador jogador2 = new Jogador("Cafú", time);

		Jogador[] jogadores = {
			jogador,
			jogador2};

		time.setJogadores(jogadores);

		System.out.println("====================");
		System.out.println("    Jogadores ");
		jogador.imprimir();
		System.out.println("====================");

		System.out.println("=================");
		System.out.println("    Time ");
		time.imiprimir();
		System.out.println("=================");


	}

}
