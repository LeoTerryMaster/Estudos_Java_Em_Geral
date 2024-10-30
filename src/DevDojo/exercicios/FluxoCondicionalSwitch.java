package DevDojo.exercicios;

public class FluxoCondicionalSwitch{


	public static void main(String[] args){
		byte dia_da_semana = 6;

		// tipo que o Switch aceita
		// char, int, byte, short, enum, String

		switch(dia_da_semana){
		case 1:
			System.out.println("Domingo  final de semana ");
			break;
		case 2:
			System.out.println("Segunda dia de semana ");
			break;
		case 3:
			System.out.println("Terça dia de semana ");
			break;
		case 4:
			System.out.println("Quarta dia de semana ");
			break;
		case 5:
			System.out.println("Quinta dia de semana ");
			break;
		case 6:
			System.out.println("Sexta dia de semana ");
			break;
		case 7:
			System.out.println("Sábado final de semana ");
			break;
		default:
			System.out.println("Fora do dia da semana ");
			break;
		}
	}

}
