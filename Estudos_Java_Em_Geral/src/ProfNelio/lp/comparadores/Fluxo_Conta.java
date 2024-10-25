package ProfNelio.lp.comparadores;

import java.util.Scanner;

public class Fluxo_Conta{


	public static void main(String[] args){

		Scanner s = new Scanner(System.in);
		System.out.println("Digite o tempo usado");

		int minutos = s.nextInt();

		double conta = 50.0;

		if(minutos >= 100){
			conta = conta + (minutos - 100) * 2.0;
		}


		System.out.printf("Valor da conta = R$ %.2f%n", conta);
		s.close();

	}


}
