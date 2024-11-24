package Xti.poo.objetos.polimorfismo.abstrct.test;

import Xti.poo.objetos.polimorfismo.abstrct.Cachorro;
import Xti.poo.objetos.polimorfismo.abstrct.Galinha;

public class AnimalTest{

	public static void main(String[] args){
		
		Cachorro vira_lata = new Cachorro();
		vira_lata.dormir();
		vira_lata.fazerBarulho();
		
		System.out.println();
		
		Galinha carijo= new  Galinha();
		carijo.dormir();
		carijo.fazerBarulho();
		
	}
}
