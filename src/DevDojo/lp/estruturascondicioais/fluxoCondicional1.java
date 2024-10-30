package DevDojo.lp.estruturascondicioais;

import java.util.Scanner;

public class fluxoCondicional1{

	public static void main(String[] args){

		Scanner s = new Scanner(System.in);
		System.out.print("Digite sua idede: ");

		int resultado = s.nextInt();

		if(resultado >= 1 && resultado <= 6){
			System.out.println("Temos um, Bebe de colo " + resultado + " anos de idade");
		}else if(resultado >= 7 && resultado <= 11){
			System.out.println("Temos uma, Criança " + resultado + " anos de idade");
		}else if(resultado >= 12 && resultado <= 17){
			System.out.println("Temos um, Adolescente " + resultado + " anos de idade");
		}else if(resultado >= 18 && resultado <= 60){
			System.out.println("Temos um, Adulto " + resultado + " anos de idade");
		}else{
			System.out.println("Temos um, 60Idoso " + resultado + " anos de idade");
		}

		s.close();
	}

}
