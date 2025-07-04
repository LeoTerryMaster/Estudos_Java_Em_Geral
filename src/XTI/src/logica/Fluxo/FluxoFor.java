package XTI.src.logica.Fluxo;

public class FluxoFor{


	public static void main(String[] args){

		for (int i = 0; i < 10; i++){
			System.out.println("i = " + i);
		}

		int j = 0;
		for (; j < 10; j++){
			System.out.println("j = " + j);
		}

		for (;;){
			System.out.println("Loop infinito");
			break; // Para evitar loop infinito, removendo isso causaria um loop infinito
		}

		System.out.println("Fim do programa");

		int k = 0;
		for (; k < 10; k++){
			System.out.println("k = " + k);
		}

		System.out.println("Valor final de k: " + k);

		System.out.println();
		for (int i = 10; i > 0; i--){
			System.out.println("Regredindo = " + i);
		}

	}

}
