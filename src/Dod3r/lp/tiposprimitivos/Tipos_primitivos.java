package Dod3r.lp.tiposprimitivos;

public class Tipos_primitivos{


	public static void main(String[] args){
		byte b = 127; // -127 /127 não pode 128
		short s = 32767; // -32767 / 32767 
		int i = 2_000_000_000;
		long l = 10L;
		float f = 10.0F;
		double d = 10.0D;
		char c = 'A';
		boolean bb = true;


		System.out.println("byte [1 byte] " + b);
		System.out.println("short [2 bytes] " + s);
		System.out.println("int [4 bytes] " + i);
		System.out.println("long [8 bytes] " + l);
		System.out.println("float [4 bytes]  flutuante " + f);
		System.out.println("double [8 bytes] flutuante " + d);
		System.out.println("char [caracteres ]" + c);
		System.out.println("boolean [verdadeiro ou falso ]" + bb);


		byte bits = 0b010101;
		System.out.println(bits);
	}

}
