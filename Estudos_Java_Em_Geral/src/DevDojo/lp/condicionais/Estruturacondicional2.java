package DevDojo.lp.condicionais;

public class Estruturacondicional2{


	/*Estrutura de fluxo condicional São para verificar condições 
	 * */

	public static void main(String[] args){

		int idade = 15;

		boolean isVerdade = idade >= 18;

		if(isVerdade){
			System.out.println("Autorizado a comprar");
		}


		// explressão usando == false 
		// se for igual a falso retorte o valor tal
		if(isVerdade == false){
			System.out.println("Não autorizado [ == false ] ");
		}


		// explressão que nega o valor verdadeiro ou pode ser trocado 
		// ! mesa utilidade que == false 
		if(!isVerdade){
			System.out.println("Não autorizado com [ ! ] ");
		}
		System.out.println("Falso");


	}

}

