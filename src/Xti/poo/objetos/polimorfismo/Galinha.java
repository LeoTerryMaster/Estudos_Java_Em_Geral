package Xti.poo.objetos.polimorfismo;

public class Galinha extends Animal{



	@Override
	public void dormir(){
		System.out.println("A galinha dormiu");
	}

	@Override
	public void fazerBarulho(){
		System.out.println("Cooo, co, co, co, coooo... ");
	}


}
