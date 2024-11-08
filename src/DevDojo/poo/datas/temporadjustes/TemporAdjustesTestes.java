package DevDojo.poo.datas.temporadjustes;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class TemporAdjustesTestes{


	public static void main(String[] args){

		LocalDate now = LocalDate.now();

//		now = now.withDayOfMonth(20);
		now = now.with(ChronoField.DAY_OF_MONTH,20);
		System.out.println(now);
		System.out.println(now.getDayOfWeek());


	}

}
