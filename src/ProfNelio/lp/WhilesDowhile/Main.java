package ProfNelio.lp.WhilesDowhile;

import java.util.Scanner;

public class Main{


	public static void main(String[] args){

		Scanner s = new Scanner(System.in);

		int x = s.nextInt();

		int somar = 0;
		while(x != 0){
			x = s.nextInt();
			somar += x;
		}

		s.close();

		System.out.println("Foi somando " + somar);
	}


}
