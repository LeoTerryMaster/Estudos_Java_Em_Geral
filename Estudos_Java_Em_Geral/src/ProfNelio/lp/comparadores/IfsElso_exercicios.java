package ProfNelio.lp.comparadores;

import java.util.Scanner;

public class IfsElso_exercicios{


	public static void main(String[] args){

		Scanner s = new Scanner(System.in);
		System.out.print("Digite o dia da seman :");

		String dia = s.nextLine().trim();


		if(dia.equalsIgnoreCase("SEGUNDA")){
			System.out.println("Hoje é Segunda - feira");
		}else if(dia.equalsIgnoreCase("TERÇA")){
			System.out.println("Hoje é Terça - feira");
		}else if(dia.equalsIgnoreCase("QUARTA")){
			System.out.println("Hoje é Quatra - feira");
		}else if(dia.equalsIgnoreCase("QUINTA")){
			System.out.println("Hoje é Quinta - feira");
		}else if(dia.equalsIgnoreCase("SEXTA")){
			System.out.println("Hoje é Sexta - feira");
		}else if(dia.equalsIgnoreCase("SÁBADO")){
			System.out.println("Hoje é Sábado");
		}else if(dia.equalsIgnoreCase("DOMINGO")){
			System.out.println("Hoje é Domingo");
		}


		s.close();

	}


}
