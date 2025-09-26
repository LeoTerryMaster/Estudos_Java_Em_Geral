package XTI.src.lp.entradadedados;

import java.util.Scanner;

public class EntradadeDados{

	
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		
		String nome=s.nextLine();
		
		System.out.println("Bem vindo  : "+nome + " você é foda!!");
		
		s.close();
		
	}
	
}
