package ProfNelio.lp.operadores;

public class CalculoRaiz{


	public static void main(String[] args){
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;


		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);

		System.out.println("Raiz Quadrada \n");
		
		System.out.println("Raiz quadrada de " + y + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 " + " = " + C);


		System.out.println();

		System.out.println("Elevado a potência \n");
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);

		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado a " + y + " = " + B);
		System.out.println("5 elevado ao quadrado = " + C);

		System.out.println();
		System.out.println("Absoluto \n");
		
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);

	}


}
