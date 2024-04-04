package DevDojo.lp.Arrays;

public class Arrays2{

	public static void main(String[] args){
		/*
		 * Nesta forma de arrays terei que especificar
		 * o valor limite, a guantidade que irei usar no array
		 * */
		int[] idades = new int[3];
		idades[0] = 1;
		idades[1] = 15;
		idades[2] = 31;
		for (int i : idades){
			System.out.print(i + " ");
		}
	}

}
