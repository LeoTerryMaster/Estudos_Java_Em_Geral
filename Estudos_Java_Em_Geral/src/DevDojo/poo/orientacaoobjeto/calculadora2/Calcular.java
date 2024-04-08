package DevDojo.poo.orientacaoobjeto.calculadora2;

public class Calcular{

	public void alteraDoisNumeros(int num1,int num2){
		num1 = 99;
		num2 = 33;
		System.out.println("Dentro do ateraDosNumeros");
		System.out.println("num1 " + num1);
		System.out.println("num2 " + num2);
	}


	public void somarArray(int[] numeros){
		int soma = 0;
		for (int i : numeros){
			soma += i;
		}
		System.out.println("Soma de Arrays " + soma);
	}


	public void somaVarArgs(int... numeros){

		int soma = 0;
		for (int i : numeros){
			soma += i;
		}
		System.out.println("Soma de VarArgs " + soma);
	}

}
