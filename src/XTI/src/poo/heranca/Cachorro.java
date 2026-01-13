package XTI.src.poo.heranca;

public class Cachorro extends Animal{

	public Cachorro(double peso,String comida){
		super(30, "Raçpão da boa ");
	}
	
	
	@Override
	public void dormi(){
	System.out.println("Cachorro dormiu");
	}
	
	@Override
	public void fezBarulho(){
		System.out.println("Cachorro fez barulho , Au Au Au Au");
	}

}
