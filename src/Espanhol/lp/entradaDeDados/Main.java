package Espanhol.lp.entradaDeDados;

import java.util.Scanner;

public class Main{

	
	
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		System.out.print("Digite o nome ");
		
		String nome = s.nextLine();
		
		System.out.println(nome);
		
		s.close();
		
	}
}
