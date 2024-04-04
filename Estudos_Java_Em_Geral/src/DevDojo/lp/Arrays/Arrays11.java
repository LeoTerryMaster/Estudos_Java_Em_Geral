package DevDojo.lp.Arrays;

public class Arrays11{

	public static void main(String[] args){
		// byte, short,long, int, float e double inicia com = 0
		// char = '\u0000' ' ' 
		// boolean = false
		//String = null
		String[] nomes = new String[] {
			"Leandro",
			"Lucas",
			"Leandra",
			"Letícia"};

		// inprime vaor null
		for (int i = 0; i < nomes.length; i++){
			System.out.println(nomes[i]);
		}

	}

}
