package Xti.poo.objetos.heranca.test;

import Xti.poo.objetos.polimorfismo.Animal;
import Xti.poo.objetos.polimorfismo.Cachorro;
import Xti.poo.objetos.polimorfismo.Galinha;

public class AnimalTest{

	public static void barulho(Animal animal) {
		animal.fazerBarulho();
	}
	
	
	public static void main(String[] args){
		
		Cachorro vira_lata = new Cachorro();
		barulho(vira_lata);
		vira_lata.dormir();
		
		System.out.println();
		
		Galinha carijo= new  Galinha();
		barulho(carijo);
		carijo.dormir();
		
	}
}
