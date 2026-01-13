package XTI.src.poo.heranca;


public class Galinha extends Animal{

	public Galinha(double peso,String comida){
		super(30, "Milho do bom");
	}
	
	@Override
	public void dormi(){
		System.out.println("galinha dormiu...");
	}
	
	@Override
	public void fezBarulho(){
		System.out.println("A galinha fez barulho, cocoricoooooo...");
	}

}
