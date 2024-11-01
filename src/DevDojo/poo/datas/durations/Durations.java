package DevDojo.poo.datas.durations;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Durations{


	public static void main(String[] args){


		LocalDateTime now = LocalDateTime.now();
		LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2).plusMinutes(8);

		LocalTime timeNow = LocalTime.now();

		LocalTime timeNowMinus7Hurs = LocalTime.now().minusHours(7);

		Duration d1 = Duration.between(now, nowAfterTwoYears);
		System.out.println(d1);


		Duration d2 = Duration.between(timeNow, timeNowMinus7Hurs);
		System.out.println(d2);


		Duration dd = Duration.ofDays(20);


		System.out.println(dd);
	}

}
