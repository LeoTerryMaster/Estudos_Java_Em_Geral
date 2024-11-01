package DevDojo.poo.datas.localdate;

import java.time.LocalDateTime;

public class LocalDateTimes{
	
	
	public static void main(String[] args){
	
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		System.out.println(localDateTime.getHour());
		System.out.println(localDateTime.getMinute());
		System.out.println(localDateTime.getSecond());
		System.out.println(localDateTime.getNano());
	}

}
