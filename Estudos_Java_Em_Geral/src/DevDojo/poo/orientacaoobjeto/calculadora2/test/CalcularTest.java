package DevDojo.poo.orientacaoobjeto.calculadora2.test;

import DevDojo.poo.orientacaoobjeto.calculadora2.Calcular;

public class CalcularTest{


	public static void main(String[] args){
		Calcular cal = new Calcular();
		int num1 = 1;
		int num2 = 2;
		cal.alteraDoisNumeros(num1, num2);

		System.out.println(num1);
		System.out.println(num2);


		int[] numeros = {
			1,
			2,
			2,
			3,
			5,
			4,
			65,
			45,};

		cal.somarArray(numeros);

		
		cal.somaVarArgs(numeros);
		
		cal.somaVarArgs(1, 2, 2, 2, 3, 5, 445, 74, 897, 98);

	}

}
