package Dod3r.atividades;

public class Potecia{


	public static void main(String[] args){

		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;

		double numB = (1 - 5) * (2 - 7);
		double denB = 2;

		double superiarA = numA / denA;
		double superiarB = Math.pow(numB / denB, 2);

		double superiar = Math.pow(superiarA - superiarB, 3);
		double inferior = Math.pow(10, 3);

		double resultado = superiar / inferior;
		System.out.println("O resoltado é " + resultado);

	}

}
