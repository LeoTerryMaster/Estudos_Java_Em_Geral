package Xti.revisao.loo.variaveis;

public class Comentarios{


	// Temos comentários de uma única linha que permite fazer uma breve descrição


	/*
	 * Temos o comentário de várias linhas que permite fazer uma descrição extensa
	 * para melhor descrever sobre métodos o que representa e o que faz
	 * */


	/**
	 * Temos o comentário de várias linha mais usado para documentação onde podemos colocar 
	 * autores
	 * descrição referência de métodos e representações
	 * @Leandro
	 * @TerryMaster
	 * <p>Podemos passar tabs de html </p> 
	 * */

	public static void main(String[] args){

		byte b = 127;
		short s = 12;
		int i = 13652;
		long l = 132;
		float f = 1.5F;
		double d = 2.0D;
		char c = 'A';
		boolean boo = true;

		System.out.println("Valor de Byte:" + b);
		System.out.println("Valor de Short:" + s);
		System.out.println("Valor de Long:" + l);
		System.out.println("Valor de Int:" + i);
		System.out.println("Valor de Float:" + f);
		System.out.println("Valor de Double:" + d);
		System.out.println("Valor de Char:" + c);
		System.out.println("Valor de Boolean verdadeiro / Falso :" + boo);


	}

}
