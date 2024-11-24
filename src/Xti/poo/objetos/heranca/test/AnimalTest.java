package Xti.poo.objetos.heranca.test;

import Xti.poo.objetos.heranca.Cachorro;
import Xti.poo.objetos.heranca.Galinha;

public class AnimalTest{

	public static void main(String[] args){
		
		Cachorro vira_lata = new Cachorro("Carne",30);
		vira_lata.dormir();
		vira_lata.fazerBarulho();
		
		System.out.println();
		
		Galinha carijo= new  Galinha("Milho",12);
		carijo.dormir();
		carijo.fazerBarulho();
		
	}
}
