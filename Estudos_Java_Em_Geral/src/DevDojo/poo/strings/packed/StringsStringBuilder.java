package DevDojo.poo.strings.packed;

public class StringsStringBuilder{


	public static void main(String[] args){

		long inicio = System.currentTimeMillis();
		concatBuilder(10_000);
		long fim = System.currentTimeMillis();

		System.out.println("Tempo gasto para StringBuilder " + (fim - inicio) + " ms");

	}


	private static void concatBuilder(int tamanho){
		StringBuilder texto = new StringBuilder(tamanho);

		for (int i = 0; i < tamanho; i++){
			texto.append(i);
		}
	}

}
