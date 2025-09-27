package XTI.src.exercicios.imc;

public class IMC{


	public static void main(String[] args){

		double pesoEmQuilogramas = 150;
		double AlturaEmMetros = 1.76;


		double imc = pesoEmQuilogramas / (AlturaEmMetros * AlturaEmMetros);


		if(imc <= 20){
			System.out.println("Abaixo do peso");
		}else if(imc >= 25 && imc <= 30){
			System.out.println("Peso ideal");
		}else if(imc >= 30 && imc <= 35){
			System.out.println("Sobrepeso");
		}else if(imc >= 35 && imc <= 45){
			System.out.println("Obeso");
		}else {
			System.out.println("Obesidade em risco");
		}

		System.out.println("O índice de massa corporal é " + imc);

	}


}
