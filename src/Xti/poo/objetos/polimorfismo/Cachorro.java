package Xti.poo.objetos.polimorfismo;


public class Cachorro extends Animal{



	
	// polimorfismo
	@Override
	public void dormir(){
		System.out.println("Cachorro dormiu!!!!");
	}

	@Override
	public void fazerBarulho(){
		System.out.println("Au, au, au au");
	}

	
	
	
}
