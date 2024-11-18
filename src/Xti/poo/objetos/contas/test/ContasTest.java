package Xti.poo.objetos.contas.test;

import Xti.poo.objetos.contas.Contas;

public class ContasTest{


	public static void main(String[] args){

		Contas conta = new Contas();
		conta.cliente = "Leandro ";
		conta.saldo = 50.000;
		conta.mostrarSaldo();


		conta.sacar(2.000);
		conta.mostrarSaldo();


		conta.depositar(9.000);
		conta.mostrarSaldo();


		Contas destino = new Contas();
		destino.cliente = "Letícia ";
		destino.saldo = 2.000;
		destino.mostrarSaldo();


		conta.trasnferir(destino, 2.000);
		destino.mostrarSaldo();
	}

}
