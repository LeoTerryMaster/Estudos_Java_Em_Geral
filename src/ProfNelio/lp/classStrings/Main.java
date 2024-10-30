package ProfNelio.lp.classStrings;

public class Main{


	public static void main(String[] args){
		String nome = "  Leandro Gomes dos Santos     ";

		System.out.println("normal " + nome);

		System.out.println();

		String up = nome.toLowerCase();
		System.out.println("toLowerCase deixa tudo em minúsculos " + up);

		System.out.println();

		String UPcase = nome.toUpperCase();
		System.out.println("toUpperCase deixa tudo em maiúsculos " + UPcase);

		System.out.println();

		String sem_espaco = nome.trim();
		System.out.println("trim deixa sem espaços " + sem_espaco);
		
		
		System.out.println();
		String sub= nome.substring(5);
		
		System.out.println("substring do elemento ao outros " + sub);

		System.out.println();
		String sub2= nome.substring(5,9);
		
		System.out.println("substring2 do elemento ao outros " + sub2);
		
		System.out.println();
		
		String repl= nome.replace("L", "G").trim();
		System.out.println(repl);
		
		int i= nome.indexOf("Go");
		int j = nome.lastIndexOf("Go");
		
		System.out.println("indexOf "+i);
		System.out.println("lastIndexOf "+j);
		
		
		String[]  receber= nome.split(" ");
		
		System.out.println(receber[0]);
		System.out.println(receber[1]);
		System.out.println(receber[2]);
		
		
		for (String s : receber){
			System.out.print(s);
		}
	}

}
