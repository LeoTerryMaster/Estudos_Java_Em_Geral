package exercicios.aleatorios.imc;

public class Imc{


	public static void main(String[] args){

		double pesoEmQuilogramas =95;
		double alturaemMetros = 1.70;

		double imc = pesoEmQuilogramas / (alturaemMetros * alturaemMetros);

		System.out.println(imc);

		String ideal = (imc >= 20 && imc <= 25) ? "Peso ideal" : "Fora do peso";
		System.out.println(ideal);
	}

}
