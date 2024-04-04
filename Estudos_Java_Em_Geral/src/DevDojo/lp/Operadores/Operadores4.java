package DevDojo.lp.Operadores;

public class Operadores4{

	/*
	 * Operadores Lógicos e de Atribuição
	 * operador = igual para dar valor 
	 * operador +=   mais ou igual ao valor  
	 * operador *=   multplicar ou igual ao valor  
	 * operador -= menos ou igual ao valor
	 * operador /= dividido ou igual ao valor
	 * operador %= resto ou igual ao valor
	 * 
	 * operadores unários 
	 * operador ++ imcrementa +1  
	 * operador -- decrementa -1
	 * 
	 * 
	 * operador  & faz a mesmam coisa que &&
	 * operador | faz a mesma coisa que ||
	 * 
	 * 
	 * operador em x++ o valor será add após a variável e ++x será executado antes da variável
	 * operador em x--  o valor será diminui após a variável e --x será executado diminuindo antes da variável
	 * */


	public static void main(String[] args){
		int x = 90;
		int y = 50;

		x = x + 100; // podemos simplificar para 
		x += 100;// podemos simplificar as expressões 


		int resultados1 = x += y;
		System.out.println("X é mais ou igual que Y " + resultados1);

		int resultados2 = x -= y;
		System.out.println("X é menos ou igual  que Y " + resultados2);

		int resultados3 = x /= y; //  igual, não pode ser comparado objetos
		System.out.println("X é Igual a Y " + resultados3);

		int resultados4 = x %= y;
		System.out.println("X é diferente a Y " + resultados4);


	}

}
