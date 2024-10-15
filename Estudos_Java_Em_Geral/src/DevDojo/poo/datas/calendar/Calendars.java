package DevDojo.poo.datas.calendar;

import java.util.Calendar;
import java.util.Date;

public class Calendars{


	public static void main(String[] args){

		Calendar calendar = Calendar.getInstance();

		if(calendar.getFirstDayOfWeek() == Calendar.SUNDAY){
			System.out.println("Domingo primeiro dia da semana ");
		}


		System.out.println("dia da semana  = " + calendar.get(Calendar.DAY_OF_WEEK));// dia da semana 
		System.out.println("ia do mes = " + calendar.get(Calendar.DAY_OF_MONTH));// dia do mes
		System.out.println("dia do ano = " + calendar.get(Calendar.DAY_OF_YEAR));// dia do ano
		System.out.println("dia da semana no mes = " + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH)); // dia da semana no mes 


		
		calendar.add(Calendar.DAY_OF_MONTH, 2);// add 2 dias 
		calendar.add(Calendar.HOUR, 2);// add 2 horas
		calendar.roll(Calendar.HOUR, 2);//
		
		Date date = calendar.getTime();

		System.out.println(date);
	}

}
