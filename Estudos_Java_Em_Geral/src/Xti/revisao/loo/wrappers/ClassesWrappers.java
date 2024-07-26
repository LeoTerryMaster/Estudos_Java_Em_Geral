package Xti.revisao.loo.wrappers;

public class ClassesWrappers{


	/*
	 * Classes wrappers
	 * */
	public static void main(String[] args){


		// classes wrappes espelho primitivo inteiros
		Byte bb = 100;
		Short ss = 100;
		Integer ii = 100;
		Long ll = 100L;


		// Classes espelho primitivo wrappers numéricos flutuantes.
		Float ff = 100.0F;
		Double dd = 100.0D;


		Character cc = 'L';
		Boolean bbs = true;


		System.out.println("Classe wrappers espelho do byte: " + bb);
		System.out.println("Classe wrappers espelho do short: " + ss);
		System.out.println("Classe wrappers espelho do int: " + ii);
		System.out.println("Classe wrappers espelho do long: " + ll);
		System.out.println("Classe wrappers espelho do float: " + ff);
		System.out.println("Classe wrappers espelho do double: " + dd);
		System.out.println("Classe wrappers espelho do char: " + cc);
		System.out.println("Classe wrappers espelho do boolean: " + bbs);

		
		
		Integer integer = new Integer("1000");
		long lo = integer.longValue();
		
		System.out.println(lo);
		
		
		String sss= integer.toString();
		
		System.out.println(sss);
		
		
		
		int i2= Integer.valueOf("101010",2);
		
		System.out.println(i2);

	}

}
