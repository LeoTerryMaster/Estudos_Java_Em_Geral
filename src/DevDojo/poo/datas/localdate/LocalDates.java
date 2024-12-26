package DevDojo.poo.datas.localdate;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDates{


	public static void main(String[] args){

		System.out.println(new Date());
		System.out.println(Calendar.getInstance());

		LocalDate localDate = LocalDate.of(2024, Month.NOVEMBER, 21);

		System.out.println("Retorna o ano = " + localDate.getYear());
		System.out.println("Retorna o número do dia do mês = " + localDate.getMonthValue());
		System.out.println("Retorna nome do dia da semana = " + localDate.getDayOfWeek());
		System.out.println("Retonra o dia do mes = " + localDate.getDayOfMonth());
		System.out.println("Retorna quantos dias tem o mês = " + localDate.lengthOfMonth());
		System.out.println("Retorna se o ano é bi sexto = " + localDate.isLeapYear());
		
		System.out.println(localDate.get(ChronoField.YEAR));
		System.out.println(localDate.get(ChronoField.YEAR_OF_ERA));
		System.out.println(localDate.get(ChronoField.DAY_OF_MONTH));
		System.out.println(localDate.get(ChronoField.DAY_OF_WEEK));
		
		System.out.println("original "+localDate);
		
		LocalDate agora = LocalDate.now();
		System.out.println(agora);
		
		agora = agora.plusDays(4);
		
		System.out.println("data  de hoje "+agora);
		
		System.out.println(LocalDate.MAX);
		System.out.println(LocalDate.MIN);

	}

}
