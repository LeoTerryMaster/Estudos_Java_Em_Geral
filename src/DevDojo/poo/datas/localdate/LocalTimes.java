package DevDojo.poo.datas.localdate;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimes{


	public static void main(String[] args){

		// formatação de hora 

		LocalTime localTime = LocalTime.of(23, 32, 25);

		System.out.println(localTime);

		LocalTime timeNow = LocalTime.now();
		
		System.out.println(timeNow);
		System.out.println(timeNow.getHour());
		System.out.println(timeNow.getMinute());
		System.out.println(timeNow.getSecond());
		System.out.println(timeNow.get(ChronoField.HOUR_OF_DAY));
		System.out.println(LocalTime.MIN);
		System.out.println(LocalTime.MAX);


	}

}
