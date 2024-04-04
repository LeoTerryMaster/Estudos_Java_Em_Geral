package DevDojo.lp.condicionais;

public class Estruturacondicional5Ternario{


	/*Estrutura de fluxo condicional São para verificar condições 
	 * */

	public static void main(String[] args){
		
		// Estrutura feita com operador ternário 
		int idade = 10;

		String isCategoria = idade <= 15 ? "Categoria infantil..." : idade >= 15 && idade <= 18 ? "Categoria juvenil..." : idade >= 18 ? "Categoria Adulto..." : "Sem Categoria...";
		System.out.println(isCategoria);


	}

}

