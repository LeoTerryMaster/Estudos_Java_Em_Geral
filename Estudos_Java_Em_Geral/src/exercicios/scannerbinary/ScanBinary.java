package exercicios.scannerbinary;

import java.util.Scanner;

public class ScanBinary{


	public static void main(String[] args){


		Scanner s = new Scanner(System.in);


		try{

			System.out.print("Digite seu número em binário: ");

			String pegar = s.nextLine();

			int binary = Integer.valueOf(pegar, 2);


			System.out.println(binary);
		}catch(Exception e){
			System.out.println("só pode ser numero binários");
			System.out.println("Error");
			s.nextLine();
			e.printStackTrace();
		}
		s.close();


	}

}
