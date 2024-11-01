package DevDojo.poo.datas.localdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimes2{


	public static void main(String[] args){

		LocalDateTime localDateTime = LocalDateTime.now();
		LocalDate date = LocalDate.parse("2024-08-06");
		LocalTime time = LocalTime.parse("09:45:00");

		System.out.println(localDateTime);
		System.out.println(date);
		System.out.println(time);
		
		LocalDateTime ldt1 = date.atTime(time);
		System.out.println(ldt1);

	}

}
