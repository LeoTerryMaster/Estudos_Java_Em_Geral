package DevDojo.poo.regex;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTest9 {

	
	
	public static void main(String[] args){

		// \\[]
		// Quantificadores
		// ? zero ou uma
		//* zero ou mais
		//+ uma ou mais
		//{n.m} de n até m
		//()
		// |  o(v|c)o
		// $ fim da linha



		String regex ="0[Xx]([0-9a-fA-F])+(\\s|$)";
		String texto ="12 0x 0X 0xFFABC 0x10G 0x1";

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
