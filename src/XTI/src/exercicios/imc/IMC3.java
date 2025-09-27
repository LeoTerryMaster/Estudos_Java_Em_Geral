package XTI.src.exercicios.imc;

import javax.swing.JOptionPane;

public class IMC3{


	public static void main(String[] args){


		String peso = JOptionPane.showInputDialog("Qual seu peso: ");
		String altura = JOptionPane.showInputDialog("Qual a sua altura: ");
		System.out.print("Digite seu peso: ");
		double pesoEmQuilogramas = Double.parseDouble(peso);

		double AlturaEmMetros = Double.parseDouble(altura);

		double imc = pesoEmQuilogramas / (AlturaEmMetros * AlturaEmMetros);

		String msg = (imc <= 20) ? "Abaixo do peso" : (imc >= 25 && imc <= 30) ? "Peso ideal" : (imc >= 30 && imc <= 35) ? "Sobrepeso" : (imc >= 35 && imc <= 45) ? "Obeso" : "Obesidade em risco";

		System.out.println("O resultando da nova insttrução é " + msg);
		System.out.println();
		System.out.println("O índice de massa corporal é " + imc);
		JOptionPane.showInternalMessageDialog(null, msg);

	}


}
