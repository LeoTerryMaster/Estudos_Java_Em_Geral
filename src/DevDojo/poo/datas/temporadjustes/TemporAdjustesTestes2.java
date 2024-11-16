package DevDojo.poo.datas.temporadjustes;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;


class ObterProximoDiaUtil implements TemporalAdjuster{

	@Override
	public Temporal adjustInto(Temporal temporal){
		DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));

		int addDay = 1;
		switch(dayOfWeek){
		case SUNDAY:
			addDay = 5;
		case THURSDAY:
			addDay = 4;
		case FRIDAY:
			addDay = 3;
			break;
		case SATURDAY:
			addDay = 2;
			break;

		default:
			addDay = 1;
			break;
		}


		return null;
	}

}


public class TemporAdjustesTestes2{


	public static void main(String[] args){

		LocalDate now = LocalDate.now();
		System.out.println(now);
		System.out.println(now.getDayOfWeek());


		now = LocalDate.now().withDayOfMonth(15).with(new ObterProximoDiaUtil());
		System.out.println(now);
		System.out.println(now.getDayOfWeek());

	}

}
