package XTI.src.exercicios.imc;

public class IMC2{


	public static void main(String[] args){

		double pesoEmQuilogramas = 55;
		double AlturaEmMetros = 1.76;


		double imc = pesoEmQuilogramas / (AlturaEmMetros * AlturaEmMetros);


		String msg = (imc <= 20) ? "Abaixo do peso" : (imc >= 25 && imc <= 30) ? "Peso ideal" : (imc >= 30 && imc <= 35) ? "Sobrepeso" : (imc >= 35 && imc <= 45) ? "Obeso" : "Obesidade em risco";

		System.out.println("O resultando da nova insttrução é " + msg);
		System.out.println();
		System.out.println("O índice de massa corporal é " + imc);

	}


}
