package DevDojo.poo.regex;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTest8 {

	
	
	public static void main(String[] args){

		// \\[]
		
		String regex ="[abc]";
		String texto ="asdas_da1ajh ";

		Pattern  pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
		System.out.println("Texto "+ texto);
		System.out.println("Índice: 0123456789" );
		System.out.println("Regex "+ regex);
		System.out.println("posições encontradas");

		while (matcher.find()){
			System.out.print(matcher.start() +", "+ matcher.group()+"\n");
		}
	}
}
