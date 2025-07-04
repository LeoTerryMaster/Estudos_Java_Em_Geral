package XTI.src.logica.Fluxo;

import java.util.Scanner;

public class FluxosIfElse3{

	public static void main(String[] args){


		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a idade: ");

		int idade = scanner.nextInt();

		if(idade > 3 && idade <= 7){
			System.out.println("É um Bebe...");
		}else if(idade >= 12 && idade < 18){
			System.out.println("É um Adolescente...");
		}else if(idade >= 18 && idade < 60){
			System.out.println("É um Adulto..");
		}else if(idade >= 60 && idade < 90){
			System.out.println("É um Jovem Idoso..");
		}else{
			System.out.println("É um Idoso..-");
		}

		scanner.close();


	}

}
