package DevDojo.poo.strings.packed;

public class StringsClass{


	public static void main(String[] args){
		String nome = "Leandro";
		String nome2 = "Leandro";

		System.out.println(nome.equals(nome2));

		String nome3 = new String("Leandro"); //1- variável de referência, 2- objeto do tipo string, 3-uma string no pool
		System.out.println("Sem intern() " + nome2 == nome3);
		System.out.println("com intern() " + nome2 == nome3.intern());


	}

}
