package DevDojo.lp.condicionais;

public class Estruturacondicional6Switch{


	/*
	 * Estrutura de fluxo condicional São para verificar condições 
	 * */

	public static void main(String[] args){
		
		byte dia_da_semana= 6;
		
		// tipo que o Switch aceita
		// char, int, byte, short, enum, String
		
		switch(dia_da_semana){
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		default:
			System.out.println("Fora do dia da semana ");
			break;
		}
	
	}

}

