package DevDojo.lp.Variavel;

public class Variaveis3{

	public static void main(String[] args){
		/*Termos 8 tidpos primitivos 
		 * 
		 *bytte
		 *short
		 *int
		 *long
		 *float
		 *double
		 *char
		 *boolean
		 *
		 * 
		 */
		byte b = 10;
		short s = 10;
		int i = 100000000;
		long l = 10000000000000000L;
		float f = 10F;
		double d = 10D;
		boolean isb = true; // true ou false
		char letras = 'L';


		long ll = i; // cast Implítico


		int ii = (int) l; // cast Explícito 


		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(isb);
		System.out.println(letras);


		System.out.println("Cast implícito " + ll);
		System.out.println("Cast Explitito " + ii);
		//impressão dos tipos primitivos

	}

}
