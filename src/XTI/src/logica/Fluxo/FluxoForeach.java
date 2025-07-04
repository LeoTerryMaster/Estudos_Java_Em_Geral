package XTI.src.logica.Fluxo;

public class FluxoForeach{


	public static void main(String[] args){
		String[] nomes = {
			"João",
			"Maria",
			"José",
			"Ana"};

		for (String nome : nomes){
			System.out.println("Nome: " + nome);
		}
		
		System.out.println();
		for (int i = 0; i < nomes.length; i++){
			String string = nomes[i];
			
			System.out.println("For simples "+string);
		}

		System.out.println();
		
		int[] numeros = {
			1,
			2,
			3,
			4,
			5};

		for (int numero : numeros){
			System.out.println("Número: " + numero);
		}
	}

}
