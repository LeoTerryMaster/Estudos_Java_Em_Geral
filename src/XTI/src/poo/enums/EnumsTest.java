package XTI.src.poo.enums;

public class EnumsTest{

	
	
	public static void main(String[] args){
		
		Enums peca = Enums.BISPO;
		System.out.println("Peça escolhida: " + peca);
		
		switch(peca){
			case PEAO:
				System.out.println("Movimento: 1 casa para frente");
				break;
			case TORRE:
				System.out.println("Movimento: Horizontal e Vertical");
				break;
			case CAVALO:
				System.out.println("Movimento: 'L'");
				break;
			case BISPO:
				System.out.println("Movimento: Diagonal");
				break;
			case Rainha:
				System.out.println("Movimento: Horizontal, Vertical e Diagonal");
				break;
			case REI:
				System.out.println("Movimento: 1 casa em qualquer direção");
				break;
			default:
				System.out.println("Peça inválida");
		}
		
		
		
		
		
		System.out.println("--- Medidas ---");
		System.out.println("Medida em cm: " + Medidas.CM.titulo);
		System.out.println("Medida em m: " + Medidas.M);
		
		
		for (Medidas m : Medidas.values()) {
			System.out.println(m + " : " + m.titulo);
			
		}
		
		for(Enums e : Enums.values()){
			System.out.println(e);
		}
		
		
		
	}
}
