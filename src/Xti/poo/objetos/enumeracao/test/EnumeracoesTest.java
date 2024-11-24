package Xti.poo.objetos.enumeracao.test;

import Xti.poo.objetos.enumeracao.Enumeracoes;
import Xti.poo.objetos.enumeracao.Enumeracoes2;

public class EnumeracoesTest{

	public static void main(String[] args){

		System.out.println(Enumeracoes.BISPO);
		System.out.println(Enumeracoes2.CM);
		System.out.println(Enumeracoes2.CM.titulo);


		for (Enumeracoes2 m : Enumeracoes2.values()){
			System.out.println(m + " = " + m.titulo);
		}


	}

}
