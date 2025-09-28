package XTI.src.lp.fluxos.swithcss;

public class Switchs{


	public static void main(String[] args){
		String dia = "quarta";


		switch(dia){
		case "segunda":
			System.out.println("acertou dia " + dia);
			break;
		case "terça":
			System.out.println("acertou dia " + dia);
			break;
		case "quarta":
			System.out.println("acertou dia " + dia);
			break;
		case "quinta":
			System.out.println("acertou dia " + dia);
			break;
		case "sexta":
			System.out.println("acertou dia " + dia);
			break;
		case "sabado":
			System.out.println("acertou dia " + dia);
			break;
		case "domingo":
			System.out.println("acertou dia " + dia);
			break;
		default:
			System.out.println("dia da semana não encontrado");
			break;
		}
	}


}
