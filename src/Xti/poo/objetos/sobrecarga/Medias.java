package Xti.poo.objetos.sobrecarga;

public class Medias{


	public double media(int x,int y){
		System.out.print("Média (int x, int y) = ");
		return (x + y) / 2;
	}


	public double somar(double... numeros){
		double somas = 0;
		for (double d : numeros){
			somas += d;
		}
		return somas;
	}


	public double media(String x,String y){
		System.out.print("Média (String x, String y) = ");
		double ix = Double.parseDouble(x);
		double iy = Double.parseDouble(y);
		return (ix + iy) / 2;
	}

	public double media(double... numeros){
		System.out.print("Média (double ... numeros) = ");
		return somar(numeros) / numeros.length;
	}

}
