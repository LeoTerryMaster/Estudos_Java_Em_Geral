package Xti.poo.objetos.heranca;


public class Cachorro extends Animal{

	

	public Cachorro(String comida,int peso){
		super("Carne", 30);
	}

	@Override
	public void dormir(){
		System.out.println("Cachorro dormiu!!!!");
	}

	@Override
	public void fazerBarulho(){
		System.out.println("Au, au, au au");
		super.fazerBarulho();
	}

	
	
	
}
