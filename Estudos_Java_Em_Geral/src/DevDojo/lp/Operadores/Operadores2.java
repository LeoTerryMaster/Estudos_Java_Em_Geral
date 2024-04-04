package DevDojo.lp.Operadores;

public class Operadores2{

	/*
	 * Operadores Lógicos básicos 
	 * Operador de resto %
	 * operador <  menor que  valores boolean
	 * operador > maior que  valores boolean
	 * operador = atribuição valores boolean
	 * operador == igual valores boolean
	 * operador != diferente valores boolean
	 * operador de ! negação 
	 * */


	public static void main(String[] args){
		int x = 90;
		int y = 50;
		int resultados = x % y;
		System.out.println("Resto " + resultados);

		boolean resultados1 = x < y;
		System.out.println("X é menor que Y " + resultados1);

		boolean resultados2 = x > y;
		System.out.println("X é maior  que Y " + resultados2);

		boolean resultados3 = x == y;
		System.out.println("X é Igual a Y " + resultados3);

		boolean resultados4 = x != y;
		System.out.println("X é diferente a Y " + resultados4);

		if(!(x == y)){
			System.out.println("errado");
		}else{
			System.out.println("certo");
		}
	}

}
