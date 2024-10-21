package DevDojo.poo.strings.packed;

public class StringsStringBuffer{


	public static void main(String[] args){

		long inicio = System.currentTimeMillis();
		concatStringBuffer(100_000);
		long fim = System.currentTimeMillis();

		System.out.println("Tempo gasto para StringBuilder " + (fim - inicio) + " ms");

	}


	private static void concatStringBuffer(int tamanho){
		StringBuffer texto = new StringBuffer(tamanho);

		for (int i = 0; i < tamanho; i++){
			texto.append(i);
		}
	}

}
