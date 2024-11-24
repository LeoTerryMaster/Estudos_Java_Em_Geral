package Xti.poo.objetos.polimorfismo.interfaces.test;

import Xti.poo.objetos.polimorfismo.interfaces.AreaCalculavel;
import Xti.poo.objetos.polimorfismo.interfaces.Cubo;
import Xti.poo.objetos.polimorfismo.interfaces.Quadrado;
import Xti.poo.objetos.polimorfismo.interfaces.VolumeCalculavel;

public class InterfaceTest{

	
	public static void area(AreaCalculavel  o){
		System.out.println(o.calcularArea());
		
	}
	
	
	public static void Volume(VolumeCalculavel  o){
		System.out.println(o.calcularVolume());
		
	}
	public static void main(String[] args){
		
		area( new Quadrado(2));
		area( new Cubo(2));
	
		
		
	}
}
