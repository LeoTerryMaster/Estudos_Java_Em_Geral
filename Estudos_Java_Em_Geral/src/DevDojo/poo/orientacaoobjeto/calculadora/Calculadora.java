package DevDojo.poo.orientacaoobjeto.calculadora;

public class Calculadora{


	public void somarDoisNumeros(){
		System.out.println("somarDoisNumeros void = " + (50 + 25));
	}

	public void calculoComParamentros(int x,int y){
		System.out.println("Soma de calculoComParamentros void = " + (x + y));
	}

	public int somar(int x,int y){
		int resultado = x + y;
		return resultado;
	}


	public int multplicar(int x,int y){
		int resultado = x * y;
		return resultado;
	}


	public int dividir(int x,int y){
		int resultado = x / y;
		return resultado;
	}

	public int resto(int x,int y){
		int resultado = x % y;
		return resultado;
	}

	public int diminuir(int x,int y){
		int resultado = x - y;
		return resultado;
	}

	// este método caso seja dividido por zero ele irá parar logo no começo
	// e se for dividido diferente de zero ai sim irá calcular
	public double dividirNumeros1(double x,double y){
		if(y != 0){
			return 0;
		}
		return x / y;
	}

	// este método verifica se é diferente se zero se for calcula
	// se for por zero ele pula o calculo
	public double dividirNumeros(double x,double y){
		if(y != 0){
			return x / y;
		}
		return 0;
	}


	public void dividirNumeros2(double x,double y){
		if(y == 0){
			System.out.println("Não existe divisão por zero");
		}else{
			System.out.println(x / y);
		}
	}

	public void dividirNumeros3(double x,double y){
		if(y == 0){
			System.out.println("Não existe divisão por zero");
			return;
		}
		System.out.println(x / y);

	}

}
