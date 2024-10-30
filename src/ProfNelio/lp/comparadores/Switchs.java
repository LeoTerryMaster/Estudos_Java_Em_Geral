package ProfNelio.lp.comparadores;

import java.util.Scanner;

public class Switchs{


	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Digite o valor do dia da semana :");

		int resultado = s.nextInt();

		switch(resultado){
		case 1:{
			System.out.println("Hoje é Domingo");
			break;
		}
		case 2:{
			System.out.println("Hoje é Segunda - Feira");
			break;
		}
		case 3:{
			System.out.println("Hoje é Terça - Feira");
			break;
		}
		case 4:{
			System.out.println("Hoje é Quarta - Feira");
			break;
		}
		case 5:{
			System.out.println("Hoje é Quinta - Feira");
			break;
		}
		case 6:{
			System.out.println("Hoje é Sexta - Feira");
			break;
		}
		case 7:{
			System.out.println("Hoje é Sábado");
			break;
		}
		default:
			System.out.println("Valor sem dia da semana, Inválido");
		}


		s.close();
	}

}
