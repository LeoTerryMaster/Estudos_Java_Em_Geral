package XTI.src.poo.estaticos.galinhas;


public class Galinha{

	public static int totalOvosDaGranja;
	
	
	public int ovos;
	
	
	public Galinha botar(){
		this.ovos++;
		totalOvosDaGranja++;
		return this;
	}
	
	
	public static double  mediaDeOvos(int galinhas){
		return (double) totalOvosDaGranja / galinhas;
		
	}
	
	
}
