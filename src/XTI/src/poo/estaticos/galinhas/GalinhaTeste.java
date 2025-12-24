package XTI.src.poo.estaticos.galinhas;

public class GalinhaTeste{

	
	
	public static void main(String[] args){
		Galinha g1 = new Galinha();
		
	g1.botar();
	g1.botar();
	g1.botar();
	g1.botar();
	
	System.out.println("Galinha 1 botou: " + g1.ovos + " ovos.");
	
	
	Galinha g2 = new Galinha();
	
	
	g2.botar().botar().botar();
	
	System.out.println("Galinha 2 botou: " + g2.ovos + " ovos.");
		

	
	Galinha g3 = new Galinha();
	
	g3.botar().botar().botar().botar().botar();
	
	System.out.println("Galinha 3 botou: " + g3.ovos + " ovos.");
	
	System.out.println("Total de ovos da granja: " + Galinha.totalOvosDaGranja + " ovos.");
	System.out.println("Total de ovos da granja: " + Galinha.mediaDeOvos(3) + " ovos.");
	
	
	}
	
}
