package Coder.src.logica;

public class Stringssss{


	public static void main(String[] args){

		
		// Manipulação de Strings em Java
		// A classe String é imutável, ou seja, uma vez criada, não pode ser alterada.
		// Métodos comuns da classe String:
		String s = "Texto";

		System.out.println("Valor de s: " + s);
		System.out.println("Tamanho de s: " + s.length());
		System.out.println("Primeiro caractere de s: " + s.charAt(0));
		System.out.println("Último caractere de s: " + s.charAt(s.length() - 1));
		System.out.println("s em letras maiúsculas: " + s.toUpperCase());
		System.out.println("s em letras minúsculas: " + s.toLowerCase());
		System.out.println("s sem espaços: " + s.trim());// Remove espaços no início e no final
		System.out.println("s substituindo 'Texto' por 'String': " + s.replace("Texto", "String"));
		System.out.println("s contém 'Tex'? " + s.contains("Tex"));
		System.out.println("s começa com 'Tex'? " + s.startsWith("Tex"));
		System.out.println("s termina com 'to'? " + s.endsWith("to"));
		
		
	}

}
