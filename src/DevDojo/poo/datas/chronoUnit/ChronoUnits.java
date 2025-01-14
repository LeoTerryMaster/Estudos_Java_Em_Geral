package DevDojo.poo.datas.chronoUnit;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ChronoUnits{


	public static void main(String[] args){


		LocalDate now = LocalDate.now();
		LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(7);

		Period p1 = Period.between(now, nowAfterTwoYears);

		System.out.println(p1);

		Period p2 = Period.ofDays(10);
		Period p3 = Period.ofWeeks(10);
		Period p4 = Period.ofMonths(10);
		Period p5 = Period.ofYears(10);

		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		System.out.println(now.until(now.plusDays(p3.getDays()), ChronoUnit.YEARS));
		System.out.println(now.until(now.plusDays(p3.getDays()), ChronoUnit.DAYS));
	}
	
	
	
}
