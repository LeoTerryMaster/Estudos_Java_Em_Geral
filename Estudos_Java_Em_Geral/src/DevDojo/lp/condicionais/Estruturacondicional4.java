package DevDojo.lp.condicionais;

public class Estruturacondicional4{


	/*Estrutura de fluxo condicional São para verificar condições 
	 * */

	public static void main(String[] args){

		// fluxo padrão feito com if & else
		int idade = 17;

		if(idade <= 15){
			System.out.println("Categoria infantil...");
		}else if(idade >= 15 && idade <= 18){
			System.out.println("Categoria juvenil...");
		}else if(idade >= 18){
			System.out.println("Categoria Adulto...");
		}


	}

}

