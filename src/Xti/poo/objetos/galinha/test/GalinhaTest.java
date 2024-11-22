package Xti.poo.objetos.galinha.test;

import Xti.poo.objetos.galinha.Galinha;

public class GalinhaTest{

	
	public static void main(String[] args){
		
		Galinha carijo= new Galinha();
		carijo.nome="Catijó";
		carijo.botar().botar().botar().botar();
		carijo.botar().botar().botar().botar();
		carijo.imprimir();
		
		System.out.println(Galinha.ovosDaGranja);
		System.out.println(Galinha.mediaDeOvos(2));
	}
}
