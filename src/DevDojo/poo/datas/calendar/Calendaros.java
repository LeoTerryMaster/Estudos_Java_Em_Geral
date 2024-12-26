package DevDojo.poo.datas.calendar;

import java.util.Calendar;
import java.util.Date;

public class Calendaros {


    public static void main(String[] args) {

        Calendar calendar= Calendar.getInstance();

        if (calendar.SUNDAY == calendar.getFirstDayOfWeek()){
            System.out.printf("domingo ");
        }




        System.out.println(calendar.getTime());

    }

}
