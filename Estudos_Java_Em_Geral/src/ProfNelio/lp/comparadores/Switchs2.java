package ProfNelio.lp.comparadores;

import java.util.Scanner;

public class Switchs2{


	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Digite o valor do dia da semana :");


		int x = s.nextInt();
		String dia ;

		switch(x){
		case 1:{
			dia = "Hoje é Domingo";
			break;
		}
		case 2:{
			dia = "Hoje é Segunda - Feira";
			break;
		}
		case 3:{
			dia = "Hoje é Terça - Feira";
			break;
		}
		case 4:{
			dia = "Hoje é Quarta - Feira";
			break;
		}
		case 5:{
			dia = "Hoje é Quinta - Feira";
			break;
		}
		case 6:{
			dia = "Hoje é Sexta - Feira";
			break;
		}
		case 7:{
			dia = "Hoje é Sábado";
			break;
		}
		default:
			dia = "Valor sem dia da semana, Inválido";
			break;

		}
		System.out.println(dia);

		s.close();
	}

}
