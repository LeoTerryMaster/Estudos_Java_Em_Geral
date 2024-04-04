package DevDojo.lp.repeticao;

public class FlucoFor3{


	public static void main(String[] args){
		int valor_max = 50;


		sair:
		for (int i = 0; i <= valor_max; i++){

			if(i >=25){
				System.out.println(i);
				break sair;
			}
			System.out.println(i);

		}

	}

}
