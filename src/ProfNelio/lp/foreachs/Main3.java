package ProfNelio.lp.foreachs;

import java.util.Scanner;

public class Main3{


	public static void main(String[] args){

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int somar = 0;
		for (int i = 0; i < n; i++){
			int x = s.nextInt();
			somar += x;
		}

		System.out.println("Foi somado "+somar);
		s.close();

	}

}
