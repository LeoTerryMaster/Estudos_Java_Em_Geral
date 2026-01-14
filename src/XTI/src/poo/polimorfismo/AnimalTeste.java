package XTI.src.poo.polimorfismo;

public class AnimalTeste{


	public static void barulhos(Animal animal){
		animal.fezBarulho();
	}
	
	public static void dormiu(Animal animal){
		animal.dormi();
	}


	public static void main(String[] args){
		double peso = 30;

		Cachorro tot = new Cachorro(peso, "Ração de carne");
		//		tot.fezBarulho();
		barulhos(tot);
		dormiu(tot);

		System.out.println(tot);

		System.out.println("============================================");
		System.out.println("separador");
		System.out.println("============================================");

		Galinha carijo = new Galinha(12, "Mulho");
		//		carijo.fezBarulho();

		barulhos(carijo);
		carijo.dormi();

		System.out.println(carijo);


	}


}
