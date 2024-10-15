package DevDojo.poo.datas.date01;

import java.util.Date;

public class Date01{


	public static void main(String[] args){
		
		
		Date date = new Date(1_000_000_000_000L); // long 10000
		
		date.setTime(date.getTime() + 3_600_000);  // add 1 hora 
		
		System.out.println(date);
		System.out.println(date.getTime());
		
		
	}
	
	
}
