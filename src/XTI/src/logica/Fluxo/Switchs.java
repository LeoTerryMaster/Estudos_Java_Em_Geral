package XTI.src.logica.Fluxo;


public class Switchs{

	
	public static void main(String[] args){
			
		char M= 'M';
		
		switch(M){
			case 'M':
				System.out.println("Macho");
				break;
			case 'F':
				System.out.println("Fémina");
				break;
			default:
				System.out.println("Sem sexo definido");
		}
	}
}
