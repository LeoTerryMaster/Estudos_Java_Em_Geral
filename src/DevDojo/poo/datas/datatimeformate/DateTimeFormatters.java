package DevDojo.poo.datas.datatimeformate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatters {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        String s1=    date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2=    date.format(DateTimeFormatter.ISO_DATE);
        String s3=    date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);



        LocalDate parse = LocalDate.parse("20241230",DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse1 = LocalDate.parse("2024-12-30",DateTimeFormatter.ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2024-12-30",DateTimeFormatter.ISO_LOCAL_DATE);


        System.out.println("Parse 1"+parse);
        System.out.println("Parse 2"+parse1);
        System.out.println("parse 3"+parse2);


        LocalDateTime  localDateTime = LocalDateTime.now();
        String s4 =localDateTime.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);


        LocalDateTime  parse4 = LocalDateTime.parse("2024-12-30T06:17:25.8546473", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("paerse 4 "+parse4);




        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formarBR= LocalDate.now().format(formatterBR);
        System.out.println("Formato de data Brasileiro "+formarBR);

        LocalDate parseBR = LocalDate.parse("19/02/2021", formatterBR);
        System.out.println(parseBR);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
       String formatBRs= LocalDate.now().format(formatter);


        System.out.println(formatBRs);


        LocalDate parserGR = LocalDate.parse("30.Dezember.2024", formatter);
        System.out.println(parserGR);


    }



}
