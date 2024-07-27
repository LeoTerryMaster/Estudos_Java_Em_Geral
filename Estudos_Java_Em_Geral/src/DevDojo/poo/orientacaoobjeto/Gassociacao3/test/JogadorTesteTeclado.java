package DevDojo.poo.orientacaoobjeto.Gassociacao3.test;

import java.util.Scanner;

import DevDojo.poo.orientacaoobjeto.Gassociacao3.Jogador;
import DevDojo.poo.orientacaoobjeto.Gassociacao3.Time;

public class JogadorTesteTeclado{


	public static void main(String[] args){


		Scanner s = new Scanner(System.in);

		System.out.println("Digite os nomes dos jogadores: ");
		String nomeJogador = s.nextLine();

//		int count = 0;
//		while(!"pronto".equalsIgnoreCase(s.next())){
//			s.nextLine();
//			count++;
//		}

		System.out.print("Digite o Nome do time:");
		String nomeTime = s.next();


		Time time = new Time(nomeTime);

		Jogador jogador = new Jogador(nomeJogador, time);
		Jogador[] jogadores = {
			jogador};
		time.setJogadores(jogadores);


		System.out.println("====================");
		System.out.println("    Jogadores ");
		jogador.imprimir();
		System.out.println("====================");

		System.out.println("=================");
		System.out.println("    Time ");
		time.imiprimir();
		System.out.println("=================");
s.close();
	}

}
