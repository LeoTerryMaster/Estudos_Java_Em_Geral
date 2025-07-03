package XTI.src.logica;

import java.util.Scanner;

public class EntradaDeDados{

	
	public static void main(String[] args){
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		
		String nome = scanner.nextLine(); // Lê uma linha de texto
		
		System.out.println("" + nome + ", seja bem-vindo ao Java!");
		
		scanner.close();
		
		
	}
}
