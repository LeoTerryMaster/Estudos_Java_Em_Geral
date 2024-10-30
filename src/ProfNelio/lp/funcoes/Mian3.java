package ProfNelio.lp.funcoes;

import java.util.Scanner;

public class Mian3{


	public static void main(String[] args){

		Scanner s = new Scanner(System.in);
		System.out.println("Digite os 3 números");


		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		int maior = max(a, b, c);

		mostar(maior);
		s.close();
	}


	public static int max(int a,int b,int c){

		int aux;

		if(a > b && a > c){
			aux = a;
		}else if(b > c){
			aux = b;
		}else{
			aux = c;
		}
		return aux;
	}


	public static void mostar(int value){
		System.out.println("O maior é :" + value);
	}

}
