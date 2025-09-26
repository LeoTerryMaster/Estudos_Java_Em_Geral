package XTI.src.lp.operadoresdeatribuicao;

public class OperadoresDeAtribuicao{


	public static void main(String[] args){

		int x = 100;

		int y = x += 10;
		int yy = x -= 10;
		int yyy = x *= 10;
		int yyyy = x /= 10;
		int yyyyy = x %= 10;


		System.out.println("resultando é += : " + y);
		System.out.println("resultando é -= : " + yy);
		System.out.println("resultando é *= : " + yyy);
		System.out.println("resultando é /= : " + yyyy);
		System.out.println("resultando é %= : " + yyyyy);

	}

}
