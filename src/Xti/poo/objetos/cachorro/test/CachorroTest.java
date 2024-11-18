package Xti.poo.objetos.cachorro.test;

import Xti.poo.objetos.cachorro.Cachorro;

public class CachorroTest{

	public static void main(String[] args){

		Cachorro pitbull = new Cachorro();
		pitbull.nome = "Cachorrinho fia da puta";
		pitbull.raca = "pitbull";
		pitbull.tamanho = 40;
		pitbull.latir();


		Cachorro vira_lata = new Cachorro();
		vira_lata.nome= "Lessi";
		vira_lata.raca="Vira Lata";
		vira_lata.tamanho =30;
		vira_lata.latir();
		
		Cachorro pastor_alemao= new Cachorro();
		pastor_alemao.nome = "Rex'";
		pastor_alemao.raca="Belga";
		pastor_alemao.tamanho=60;
		pastor_alemao.latir();
		
	}

}
