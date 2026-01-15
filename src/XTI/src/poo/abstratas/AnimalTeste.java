package XTI.src.poo.abstratas;


public class AnimalTeste{


	public static void main(String[] args){
		double peso = 30;

		Cachorro tot = new Cachorro(peso, "Ração de carne");
		tot.fezBarulho();
		tot.dormi();
		System.out.println(tot);

		System.out.println("============================================");
		System.out.println("separador");
		System.out.println("============================================");

		Galinha carijo = new Galinha(12, "Mulho");
		carijo.fezBarulho();
		carijo.dormi();
		System.out.println(carijo);
		
		
		
		
		

	}


}
