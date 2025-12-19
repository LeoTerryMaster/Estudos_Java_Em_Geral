package XTI.src.poo.matematica;

import java.util.Optional;
import java.util.logging.Logger;


public class Matemtica{

	private static final Logger logger = Logger.getLogger(Matemtica.class.getName());

	/**
	 * 
	 * @param x
	 * @param y
	 * @return retorna o maior entre 2 numeros
	 */
	public int maior(int x,int y){

		if(x > y){
			return x;
		}else{
			return y;
		}

	}


	public double somar(double x,double y){
		double d = x + y;
		return d;
	}


	public double multiplicar(double x,double y){
		double d = x * y;
		return d;
	}

	public Optional<Object> dividir(double x,double y){
		if(y == 0){
			return Optional.empty();
		}
		return Optional.of(x / y);
	}


	public double dividir2(double x,double y){
		if(y == 0){
			throw new IllegalArgumentException("O divisor não pode ser zero.");
		}
		return x / y;
	}

	public double dividir3(double x,double y){
		assert y != 0 : "O divisor não pode ser zero!";
		return x / y;
	}


	public double dividir4(double x,double y){
		if(y == 0){
			logger.severe("Tentativa de divisão por zero!");
			return 0;
		}
		return x / y;
	}


	public double raiz(double x){
		double d = Math.sqrt(x);
		return d;
	}

	public int raizManual(int numero){
		int raiz = 0, impar = 1;
		while(numero >= impar){
			numero -= impar;
			impar += 2; // proxima numero impar
			++raiz;
		}
		return raiz;
	}


}
