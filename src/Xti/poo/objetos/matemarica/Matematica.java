package Xti.poo.objetos.matemarica;

public class Matematica{


	public int maior(int um,int dois){

		if(um > dois){
			return um;
		}else{
			return dois;
		}
	}


	public int somar(int x,int y){

		return x + y;
	}


	public int raiz(int numero){

		int raiz = 0, impar = 1;

		while(numero >= impar){
			numero -= impar;
			impar += 2;
			++raiz;
		}
		return raiz;
	}
	
	
	

}
