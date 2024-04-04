package DevDojo.poo.orientacaoobjeto.calculadora.teste;

import DevDojo.poo.orientacaoobjeto.calculadora.Calculadora;

public class CalcuuladoraTeste{


	public static void main(String[] args){

		Calculadora calcular = new Calculadora();
		int somar = calcular.somar(50, 150);
		System.out.println("Resultado da soma = " + somar);

		int multplicar = calcular.multplicar(250, 3);
		System.out.println("Resultado da multplicar = " + multplicar);


		int dividir = calcular.dividir(250, 3);
		System.out.println("Resultado da dividir = " + dividir);


		int resto = calcular.resto(250, 3);
		System.out.println("Resultado da resto = " + resto);

		int diminuir = calcular.diminuir(250, 3);
		System.out.println("Resultado da diminuir = " + diminuir);

		double dividindo = calcular.dividirNumeros(250, 0);
		System.out.println("Resultado da dividindo com parâmentros  = " + dividindo);

		calcular.calculoComParamentros(10, 20);
		calcular.somarDoisNumeros();
		calcular.dividirNumeros2(25, 0);
		calcular.dividirNumeros3(25, 0);
	}

}
