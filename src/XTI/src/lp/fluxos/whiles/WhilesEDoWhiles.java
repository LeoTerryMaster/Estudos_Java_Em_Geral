package XTI.src.lp.fluxos.whiles;

import java.util.ArrayList;
import java.util.Scanner;

public class WhilesEDoWhiles{


	public static void main(String[] args){


		ArrayList<String> produtos = new ArrayList<>();

		Scanner s = new Scanner(System.in);
		System.out.println("Liste seus produtos e para sair (FIM) :");

		String produto;

		while(!"FIM".equalsIgnoreCase(produto = s.nextLine())){
			produtos.add(produto);
		}

		System.out.println(produtos.toString());

		s.close();
	}


}
