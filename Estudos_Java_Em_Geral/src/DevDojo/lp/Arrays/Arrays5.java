package DevDojo.lp.Arrays;

public class Arrays5{

	public static void main(String[] args){
		// byte, short,long, int, float e double inicia com = 0
		// char = '\u0000' ' ' 
		// boolean = false
		//String = null
		String[] nomes = new String[4];
		nomes[0] = "Leandro";
		nomes[1] = "Lucas";
		nomes[2] = "Leandra";
		nomes[3] = "Letícia";

		for (int i = 0; i < 4; i++){
			System.out.println(nomes[i]);
		}

	}

}
