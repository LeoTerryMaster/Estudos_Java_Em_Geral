package XTI.src.logica.operadores;

public class OperadoresMatematicos{


	public static void main(String[] args){

		//2+3 operador binário
		// -2 operador unário
		// true? "sim":"não"; operador ternário

		int a = 10;

		int b = 20;

		int c = a % b;

		System.out.println("El resultado de a % b es: " + c);

		c = a + b;

		System.out.println("El resultado de a + b es: " + c);

		c = a - b;

		System.out.println("El resultado de a - b es: " + c);

		c = a * b;

		System.out.println("El resultado de a * b es: " + c);

		c = a / b;
		if (b == 0) {
			System.out.println("No se puede dividir por cero.");
			return;
		}
		System.out.println("El resultado de a / b es: " + c);

	}

}
