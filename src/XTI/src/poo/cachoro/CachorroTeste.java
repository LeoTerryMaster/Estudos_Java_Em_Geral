package XTI.src.poo.cachoro;

public class CachorroTeste{

	public static void main(String[] args){

		Cachorro vira_lata = new Cachorro();
		vira_lata.nome = "Perseu";
		vira_lata.raca = "Vira lata";
		vira_lata.tamanho = 120;
		vira_lata.latir();


		Cachorro2 pastor_alemao = new Cachorro2(120, "Pastor Alemão", "Freed");
		pastor_alemao.latir();
//		System.out.println(pastor_alemao);


	}

}
