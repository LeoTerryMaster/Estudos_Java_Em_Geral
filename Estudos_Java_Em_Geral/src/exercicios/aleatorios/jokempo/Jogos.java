package exercicios.aleatorios.jokempo;

import java.util.Random;
import java.util.Scanner;

public class Jogos{


	// 1 - Papel 2 - Pedra 3 -tesoura
	// U(1) C(2)= -1, vencedor usuário	
	// U(1) C(3)= -2, vencedor computador	
	// U(2) C(1)= 1, vencedor computador	
	// U(2) C(3)= -1, vencedor usuário	
	// U(3) C(1)= 2, vencedor usuário	
	// U(3) C(2)= 1, vencedor Computador	


	public static void main(String[] args){

		int usuario = 1;
		int computador = 2;


		Scanner s = new Scanner(System.in);
		System.out.print("1-Papel 2-Pedra 3-tesoura  = Digite de 1 a 3:  ");

		Random gerador = new Random();
		usuario = s.nextInt(); 

		computador= gerador.nextInt(3)+1;// gera número de 1 a 3
		
		switch(computador){
		case 1:
			System.out.println("Foi escolhido Papel ");
			break;
		case 2:
			System.out.println("Foi escolhido Pedra ");
			break;
		case 3:
			System.out.println("Foi escolhido Tesoura ");
			break;
		default:
			break;
		}

		if(usuario == computador){
			System.out.println("Deu empate");
		}if((usuario - computador) ==-1||(usuario - computador) ==2){
			System.out.println("Usuário venceu!! ");
		}else{
			System.out.println("Máquina venceu!!!");
		}


		s.close();
	}


}
