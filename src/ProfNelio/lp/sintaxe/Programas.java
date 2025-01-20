package ProfNelio.lp.sintaxe;

import java.util.Scanner;

public class Programas{


	public static void main(String[] args){

		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		int maior = max(a, b, c);

		showResultado(maior);
		s.close();

	}


	public static int max(int x,int y,int z){
		int aux = 0;

		if(x > y && x > z){
			aux = x;
		}else if(y > z){
			aux = y;
		}else{
			aux = z;
		}
		return aux;
	}


	public static void showResultado(int r){
		System.out.println("O maior é...   " + r);
	}

}
