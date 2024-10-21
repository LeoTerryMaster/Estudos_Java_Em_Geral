package DevDojo.poo.datas.calendar;

import java.text.DateFormat;
import java.util.Calendar;

public class DataFormats{


	public static void main(String[] args){

		Calendar calendar = Calendar.getInstance();

		DateFormat[] dFormats = new DateFormat[7];
		dFormats[0] = DateFormat.getInstance();
		dFormats[1] = DateFormat.getDateInstance();
		dFormats[2] = DateFormat.getTimeInstance();
		dFormats[3] = DateFormat.getDateInstance(DateFormat.SHORT);
		dFormats[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);
		dFormats[5] = DateFormat.getDateInstance(DateFormat.LONG);
		dFormats[6] = DateFormat.getDateInstance(DateFormat.FULL);

		for (DateFormat d : dFormats){
			System.out.println("Formatação da data = " + d.format(calendar.getTime()));
		}


	}

}
