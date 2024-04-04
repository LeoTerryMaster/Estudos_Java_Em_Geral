package DevDojo.lp.Operadores;

public class Operadores3{

	/*
	 * Operadores Lógicos e de comparação 
	 * operador <  menor que  retorna valor boolean
	 * operador > maior que  retorna valor boolean
	 * operador = atribuição retorna valor boolean
	 * operador == igual retorna valor boolean
	 * operador != diferente retorna valor boolean
	 * operador de ! negação 
	 * operador && [AND]comparação deve ser as 2 posições verdadeira ou falsas retorna valor boolean
	 * operador || [OR]  ou  operador que retorna um dos tipo de comparação
	 * 
	 * */


	public static void main(String[] args){
		int x = 90;
		int y = 50;

		boolean resultados1 = x < y;
		System.out.println("X é menor que Y " + resultados1);

		boolean resultados2 = x > y;
		System.out.println("X é maior  que Y " + resultados2);

		boolean resultados3 = x == y;
		System.out.println("X é Igual a Y " + resultados3);

		boolean resultados4 = x != y;
		System.out.println("X é diferente a Y " + resultados4);

		/*neste operador de negação sempre será o valor negado 
		 *se a operação retornar um valor verdadeiro o valor será trocado
		 * se for verdadeiro o valor passa a ser falso
		 * se for falso passa a ser veradeiro
		 * */
		if(!(x == y)){
			System.out.println("errado");
		}else{
			System.out.println("certo");
		}

		/*no operador && os 2 tipos de comparação devem resultar no memso valor para que seja feita 
		 * essa comparação ou comparar no objetivo.
		 * se um tido da comparação não obter o valor desejado o valor boolean não pode ser o esperado.
		 * Neste operador && os 2 tipos precisa retornar o mesmo valor para atingir o valor esperado 
		 * */
		if(x == y && y != x){
			System.out.println("verdadeiro ");
		}else{
			System.out.println("falso");
		}


		/*o operador || ou, or, se umn tipo do cada lado for verdadeiro vai retornar verdadeiro
		 * não precisa ter os 2 tipo retornando o mesmo valor e sim apenas um.
		 * se os 2 tipos forem iguais a instrução será pulada para  a próxima.  
		 * */
		if(x == y || y != x){
			System.out.println("Verdadeiro");
		}else{
			System.out.println("falso");
		}
	}

}
