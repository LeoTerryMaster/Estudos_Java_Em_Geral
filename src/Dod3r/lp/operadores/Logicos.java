package Dod3r.lp.operadores;

public class Logicos{


	public static void main(String[] args){

		boolean condicao = true;
		boolean condicao2 = 3 > 7;


		System.out.println(condicao && !condicao2);
		System.out.println(condicao && condicao2);
		System.out.println(condicao ^ condicao2);
		System.out.println(condicao);
		System.out.println(!condicao);
		System.out.println(!!condicao);


	}

}
