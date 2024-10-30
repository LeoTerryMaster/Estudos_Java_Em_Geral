package ProfNelio.lp.bitwise;

import java.util.Scanner;

public class Main2{


	public static void main(String[] args){

		// comparação de bits 
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		int mask = 0b00100000;

		if((n & mask) != 0){
			System.out.println("6th bit is true!");
		}else{
			System.out.println("6th bit is false!");
		}
		scanner.close();
	}

}
