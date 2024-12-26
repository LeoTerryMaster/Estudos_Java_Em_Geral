package DevDojo.poo.datas.zonedatetime;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneDateTimes{


	public static void main(String[] args){
		Map<String, String> zonaIDs = ZoneId.SHORT_IDS;

		System.out.println(zonaIDs);


		ZoneId tokyo = ZoneId.of("Asia/Tokyo");
		System.out.println(tokyo);

		System.out.println(ZoneId.systemDefault());

		LocalDateTime now = LocalDateTime.now();

		ZonedDateTime zoneDateTimes = now.atZone(tokyo);
		System.out.printf(zoneDateTimes.toString());

		System.out.println();
		Instant instant = Instant.now();
		System.out.println(instant);
		ZonedDateTime zonedDateTime = instant.atZone(tokyo);
		System.out.println(zonedDateTime);


		System.out.println(ZoneOffset.MAX);


		JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
		System.out.println(japaneseDate);

		LocalDate localDate = LocalDate.of(1900,2,1);
		System.out.println(localDate);

		JapaneseDate meijiera = JapaneseDate.from(localDate);
		System.out.println(meijiera);
	}

}
