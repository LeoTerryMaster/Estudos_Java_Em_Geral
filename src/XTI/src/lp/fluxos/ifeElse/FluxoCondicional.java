package XTI.src.lp.fluxos.ifeElse;

public class FluxoCondicional{


	public static void main(String[] args){

		int idade = 41;


		if(idade < 7){
			System.out.println("É cuma criança!!");
		}else if(idade >= 7 && idade <= 12){
			System.out.println("Pré adolescente!!");
		}else if(idade >= 12 && idade <= 18){
			System.out.println("adolescente!!");
		}else if(idade >= 18 && idade <= 61){
			System.out.println("Adulto!!");
		}else{
			System.out.println("Melhor idade!!");
		}


	}


}
