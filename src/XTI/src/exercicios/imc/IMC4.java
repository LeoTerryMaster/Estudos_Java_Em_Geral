package XTI.src.exercicios.imc;

import java.util.Scanner;

public class IMC4{


	public static void main(String[] args){


		Scanner s = new Scanner(System.in);

		System.out.print("Digite seu peso: ");
		String peso = s.nextLine();
		if(peso.isEmpty()){
			System.out.println("peso não pode estar vazio");
			s.close();
			return;
		}
		
		String altura = s.nextLine();
		if(altura.isEmpty()){
			System.out.println("Altuira não pode estar vazia");
			s.close();
			return;
		}

		double pesoEmQuilogramas = Double.parseDouble(peso);

		System.out.print("Digite sua altura: ");
		double AlturaEmMetros = Double.parseDouble(altura);



		double imc = pesoEmQuilogramas / (AlturaEmMetros * AlturaEmMetros);

		String msg = (imc <= 20) ? "Abaixo do peso" : (imc >= 25 && imc <= 30) ? "Peso ideal" : (imc >= 30 && imc <= 35) ? "Sobrepeso" : (imc >= 35 && imc <= 45) ? "Obeso" : "Obesidade em risco";

		System.out.println("O resultando da nova instrução é : " + msg);
		System.out.println();
		System.out.println("O índice de massa corporal é  :" + imc);
		s.close();

	}


}
