package exercicios.aleatorios.imc;

import javax.swing.JOptionPane;

public class Imc2{


	public static void main(String[] args){

		String peso = JOptionPane.showInputDialog("Qual seu peso:");
		double pesoEmQuilogramas = Double.parseDouble(peso);
		String altura = JOptionPane.showInputDialog("Qual é sua altura:");

		double alturaemMetros = Double.parseDouble(altura);


		double imc = pesoEmQuilogramas / (alturaemMetros * alturaemMetros);
		String msg = (imc >= 20 && imc <= 25) ? "Peso ideal" : "Fora do peso";

		System.out.println(imc);
		System.out.println(msg);

		msg = "IMC = " + imc + "\n" + msg;

		JOptionPane.showMessageDialog(null, msg);
	}

}
