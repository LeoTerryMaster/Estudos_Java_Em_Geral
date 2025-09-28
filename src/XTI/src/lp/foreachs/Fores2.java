package XTI.src.lp.foreachs;

public class Fores2{


	public static void main(String[] args){


		int tamanho = 15;
		for (int i = 0; i <= tamanho; i++){
			for (int j = 0; j <= tamanho; j++){
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 0; i <= tamanho; i++){
			System.out.println("* ");
			for (int j = 0; j <= i; j++){
				System.out.print("* ");
			}
		}

	}

}
