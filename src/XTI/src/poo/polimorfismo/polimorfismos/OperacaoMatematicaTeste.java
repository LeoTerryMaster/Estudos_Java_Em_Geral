package XTI.src.poo.polimorfismo.polimorfismos;

public class OperacaoMatematicaTeste{

	public static void calcular(OperacaoMatematica calcular, double x, double y){
				 System.out.println(calcular.calcular(x, y));
	}
	
	
	public static void main(String[] args){
		
		calcular(new Soma(), 10, 25);
		calcular(new Multplicacao(), 10, 25);
		
		
	}
}
