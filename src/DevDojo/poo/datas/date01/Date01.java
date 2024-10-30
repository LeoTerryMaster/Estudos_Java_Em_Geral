package DevDojo.poo.datas.date01;

import java.util.Date;

public class Date01{


	public static void main(String[] args){


		Date date = new Date(); // long 10000

		date.setTime(date.getTime() + 3_600_000); // add 1 hora 

		System.out.println(date);


		System.out.println("Recuperda a data em ms = " + date.getTime());


		Date data_de_hoje = new Date(1729438673228L);
		System.out.println(data_de_hoje);
	}


}
