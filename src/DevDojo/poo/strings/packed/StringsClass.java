package DevDojo.poo.strings.packed;

public class StringsClass{


	public static void main(String[] args){
		String nome = "Leandro"; // poll de strings
		String nome2 = "Leandro";

		System.out.println(nome);

		System.out.println(nome.equals(nome2)); // retorna  o mesmo valor tendo diferença de letas
		System.out.println(nome.equalsIgnoreCase(nome2)); // retorna valor independente se é maiúscula ou minúscula

		nome = nome.concat(" Suane");

		System.out.println("Com concat " + nome);


		String nome3 = new String("Leandro"); //1- variável de referência, 2- objeto do tipo string, 3-uma string no pool de string
		System.out.println("Sem intern() " + (nome2 == nome3));
		System.out.println("com intern() " + (nome2 == nome3.intern())); // faz a leitura do nome do objeto.

		System.out.println(nome3);


	}

}
