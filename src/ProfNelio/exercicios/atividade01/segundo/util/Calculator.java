package ProfNelio.exercicios.atividade01.segundo.util;

public class Calculator{

	public final double PI = 3.14159;

	public double circumference(double radius){
		return 2.0 * PI * radius;
	}


	public double VolumeCalculavel(double radius){
		return 4.0 * PI * radius * radius * radius / 3;
	}

}
