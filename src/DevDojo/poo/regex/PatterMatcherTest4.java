package DevDojo.poo.regex;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTest4 {

	
	
	public static void main(String[] args){

		// \s = espaçes em brancos\t \n \f \r
		
		String regex ="\\s";
		String texto ="asdasda1ajh kfkdhfkdjfoeakaba1 ldfdsçlab a23";

		Pattern  pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
		System.out.println("Texto "+ texto);
		System.out.println("Índice: 0123456789" );
		System.out.println("Regex "+ regex);
		System.out.println("posições encontradas");

		while (matcher.find()){
			System.out.print(matcher.start() +", ");
		}
	}
}
