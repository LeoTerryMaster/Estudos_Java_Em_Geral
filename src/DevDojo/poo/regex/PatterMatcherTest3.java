package DevDojo.poo.regex;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTest3 {

	
	
	public static void main(String[] args){
		
		
		String regex ="\\D"; // retorna todos os que n for  dígitos (letras ).
		String texto ="asdasda1ajhkfkdhfkdjfoeakaba1ldfdsçlaba23";

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
