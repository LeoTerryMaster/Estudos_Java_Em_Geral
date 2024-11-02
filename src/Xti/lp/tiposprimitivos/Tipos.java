package Xti.lp.tiposprimitivos;

public class Tipos{


	public static void main(String[] args){

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


		byte bits = 0b010101;
		System.out.println(bits);
	}

}
