package Dod3r.lp.wrappers;

public class ClasseWrappers{


	public static void main(String[] args){

		System.out.println("Tipos primitivos \n");


		byte b = 127; // -127 /127 não pode 128
		short s = 32767; // -32767 / 32767 
		int i = 2_000_000_000;
		long l = 10L;
		float f = 10.0F;
		double d = 10.0D;
		char c = 'A';
		boolean bb = true;


		System.out.println("byte " + b);
		System.out.println("short " + s);
		System.out.println("int " + i);
		System.out.println("long " + l);
		System.out.println("float " + f);
		System.out.println("double " + d);
		System.out.println("char " + c);
		System.out.println("boolean " + bb);

		System.out.println();

		System.out.println("Classe Wrappers do tipos primitivos");
		System.out.println();

		Byte bbb = 10;
		Short ss = 10;
		Integer ii = 10;
		Long ll = 10L;
		Float ff = 10F;
		Double dd = 10D;
		Character cc = 'A';
		Boolean verdade = true;


		System.out.println("Byte " + bbb);
		System.out.println("Short " + ss);
		System.out.println("Integer" + ii);
		System.out.println("Long " + ll);
		System.out.println("Float " + ff);
		System.out.println("Double " + dd);
		System.out.println("Character " + cc);
		System.out.println("Boolean " + verdade);

		System.out.println();


		Double preco = new Double("100.0");
		Double precs = Double.valueOf("100.0");
		System.out.println(preco);
		System.out.println(precs);


	}

}
