package XTI.src.lp.arrays.MultDimencionais;

import java.util.Arrays;

public class ArrayMultDimencional{


	public static void main(String[] args){
		String[][] duas = {
			{
				"Leandro",
				"M",
				"RJ"},
			{
				"Leticia",
				"F",
				"RJ"},
			{
				"Leandra",
				"F",
				"RJ"},
			{
				"Lucas",
				"M",
				"RJ"}
		};

		
		System.out.println(duas[0][0]);
		System.out.println(duas[1][0]);
		System.out.println(duas[2][0]);
		System.out.println(duas[3][0]);
		
		System.out.println();
		
		System.out.println(duas[3][0].length());

		System.out.println();
		
		
		for (String[] d : duas){
			System.out.println("varios "+Arrays.toString(d));
		}
		
		
		System.out.println();
		
		for (String[] s : duas){
			
			
			System.out.println("Todos "+Arrays.toString(s));
			
		}

	}

}
