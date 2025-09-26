package XTI.src.lp.wrappers;

public class ClassesWrappers{


	public static void main(String[] args){

		String numericos = "5000";


		Integer idade = 55;
		Integer idades = new Integer("55");

		int bynario = Integer.valueOf("1010101011", 2);


		System.out.println(idade);
		System.out.println(idades.intValue());
		System.out.println("byte value " + idades.byteValue());

		int n = Integer.parseInt(numericos);

		System.out.println("número convertido " + n);

		System.out.println();
		System.out.println("convbersão numeto binários " + bynario);

	}

}
