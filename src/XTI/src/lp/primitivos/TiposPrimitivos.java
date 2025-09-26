package XTI.src.lp.primitivos;

public class TiposPrimitivos{


	public static void main(String[] args){
		byte id = 10;
		short s = 51;
		int idades = 41;
		long IDS = 100;
		float f = 1.10F;
		double d = 1.10D;
		boolean b = false;
		char c = 'L';


		byte bb = 0b01010101;

		System.out.println("byte - " + id);
		System.out.println("short - " + s);
		System.out.println("int - " + idades);
		System.out.println("long - " + IDS);
		System.out.println("float - " + f);
		System.out.println("double - " + d);
		System.out.println("boolean - " + b);
		System.out.println("char - " + c);


		System.out.println();

		System.out.println("0b01010101 representação binária - "  + bb);
	}

}
