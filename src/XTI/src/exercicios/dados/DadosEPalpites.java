package XTI.src.exercicios.dados;

import java.util.Random;
import java.util.Scanner;

public class DadosEPalpites{


	public static void main(String[] args){
		Scanner s = new Scanner(System.in);

		System.out.print("Digite seu palpite :");
		int palpite = s.nextInt();


		Random r = new Random();


		int dado = r.nextInt(6) + 1;

		if(palpite == dado){
			System.out.println("Acertou mizeravi " + " dado = " + dado + " e palpite =" + palpite);
		}else{
			System.out.println("Errouuuuuu !!!! " + " dado = " + dado + " e palpite =" + palpite);
		}


		s.close();

	}


}
