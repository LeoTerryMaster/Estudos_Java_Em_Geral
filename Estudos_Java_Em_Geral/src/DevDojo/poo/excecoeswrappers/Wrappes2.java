package DevDojo.poo.excecoeswrappers;

public class Wrappes2{


	public static void main(String[] args){

		byte bytep = 0;
		short shotp = 0;
		int intp = 0;
		long longp = 0;
		float floatp = 0;
		double doublep = 0;
		char chatp = 'L';
		boolean booleanp = false;


		System.out.println("Promitivo " + bytep + shotp + intp + longp + floatp + doublep + chatp + booleanp);


		System.out.println();


		Byte bytew = 0;
		Short shotw = 0;
		Integer intw = 1; // autoboxing
		Long longw = 0L;
		Float floatw = 0F;
		Double doublew = 0D;
		Character chatw = 'L';
		Boolean booleanw = false;

		System.out.println("Classes Wrappers " + bytew + shotw + intw + longw + floatw + doublew + chatw + booleanw);


		int i = (int) intw.longValue(); //unboxing

	}

}
