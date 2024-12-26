package DevDojo.poo.datas.periotion;

import java.time.LocalDate;
import java.time.Period;

public class Periotions{


	public static void main(String[] args){


		LocalDate now = LocalDate.now();
		LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(7);

		Period p1 = Period.between(now, nowAfterTwoYears);


		System.out.println(p1);
		
		
		
		Period p2 = Period.ofDays(10);
		Period p3 = Period.ofWeeks(10);
		Period p4 = Period.ofMonths(10);
		Period p5 = Period.ofYears(10);

		System.out.println("10 dias "+p2);
		System.out.println("10 semanas "+p3);
		System.out.println("10 meses "+p4);
		System.out.println("10 anos "+p5);
	}

}
