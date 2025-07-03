package XTI.src.logica.operadores;

public class OperadoresDeAtribuicao{


	public static void main(String[] args){


		/*
		 * int a = 10; // Atribuição simples
		 * a + a= 5; // Atribuição com adição
		 * a - a = 3; // Atribuição com subtração
		 * 	a += 5; // Atribuição com adição
		 * */

		int x = 10; // Atribuição simples

		x = x + 3;// Atribuição com adição
		System.out.println("mesmo resultado " + x);

		x += 3; // Atribuição com adição abreviada
		System.out.println("mesmo resultado " + x);

		System.out.println();
		// Operadores de atribuição
		int a = 10;
		int b = 20;

		System.out.println("Valor inicial de a: " + a);
		System.out.println("Valor inicial de b: " + b);

		a += 5; // a = a + 5
		System.out.println("Após a += 5, valor de a: " + a);

		b -= 3; // b = b - 3
		System.out.println("Após b -= 3, valor de b: " + b);

		a *= 2; // a = a * 2
		System.out.println("Após a *= 2, valor de a: " + a);

		b /= 4; // b = b / 4
		System.out.println("Após b /= 4, valor de b: " + b);

		a %= 3; // a = a % 3
		System.out.println("Após a %= 3, valor de a: " + a);

		a &= 1; // a = a & 1 (AND bitwise)
		System.out.println("Após a &= 1, valor de a: " + a);

		a |= 2; // a = a | 2 (OR bitwise)
		System.out.println("Após a |= 2, valor de a: " + a);

		a ^= 3; // a = a ^ 3 (XOR bitwise)
		System.out.println("Após a ^= 3, valor de a: " + a);

		a <<= 1; // Deslocamento à esquerda
		System.out.println("Após a <<= 1, valor de a: " + a);

		a >>= 1; // Deslocamento à direita
		System.out.println("Após a >>= 1, valor de a: " + a);
	}

}
