package DevDojo.poo.strings.packed;

public class StringsPerformace{


	public static void main(String[] args){

		long inicio = System.currentTimeMillis();
		concatString(100_000);
		long fim = System.currentTimeMillis();

		System.out.print("Tempo gasto para String " + (fim - inicio) + " ms");

	}


	private static void concatString(int tamanho){
		String texto = "";
		for (int i = 0; i < tamanho; i++){
			texto += i;

		}
	}

}
