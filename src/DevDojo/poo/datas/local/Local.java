package DevDojo.poo.datas.local;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Local{


	public static void main(String[] args){

		//pt-BR
		Locale local = new Locale("pt", "BR");
		Locale local2 = new Locale("en", "US");
		Locale local3 = new Locale("ja", "JP");

		Calendar calendar = Calendar.getInstance();

		DateFormat dt = DateFormat.getDateInstance(DateFormat.FULL, local);
		DateFormat dt2 = DateFormat.getDateInstance(DateFormat.FULL, local2);
		DateFormat dt3 = DateFormat.getDateInstance(DateFormat.FULL, local3);


		System.out.println("Brasil " + dt.format(calendar.getTime()));
		System.out.println("Estados Unidos " + dt2.format(calendar.getTime()));
		System.out.println("Japão " + dt3.format(calendar.getTime()));

		
		
		System.out.println(local2.getDisplayCountry());
		
		System.out.println(local3.getDisplayCountry());
	}

}
