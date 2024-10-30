package ProfNelio.lp.funcoes;

import java.util.Scanner;

public class Mian2{


	public static void main(String[] args){

		Scanner s = new Scanner(System.in);
		System.out.println("Digite os 3 números");


		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		if(a > b && a > c){
			System.out.print("O maior é o [A] : " + a);
		}else if(b > c){
			System.out.print("O maior é o [B] :" + b);
		}else{
			System.out.print("O maior é o: [C] :" + c);
		}

		s.close();
	}

}
