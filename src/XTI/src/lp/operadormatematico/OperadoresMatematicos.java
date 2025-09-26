package XTI.src.lp.operadormatematico;

public class OperadoresMatematicos{


	public static void main(String[] args){
		double x = 17 - 9;
		double xx = 17 + 9;
		double xxx = 17 / 9;
		double xxxx = 17 * 9;
		double xxxxx = -9;
		double xxxxxx = +9;

		double y = xxxxxx++;
		double yy = ++xxxxxx;
		double yyy = --xxxxxx;
		double yyyy = xxxxxx--;

		System.out.println("O resultado subtrair, é " + x);
		System.out.println("O resultado somar, é " + xx);
		System.out.println("O resultado dividor, é" + xxx);
		System.out.println("O resultado multplicar, é " + xxxx);
		System.out.println("O resultado negativar, é " + xxxxx);
		System.out.println("O resultado positivar, é " + xxxxxx);
		System.out.println("O resultado pos incremento, é " + y);
		System.out.println("O resultado pre incremento, é " + yy);
		System.out.println("O resultado pre decremento, é " + yyy);
		System.out.println("O resultado pos decremento, é " + yyyy);
	}

}
