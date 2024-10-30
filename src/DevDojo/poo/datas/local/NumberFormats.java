package DevDojo.poo.datas.local;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormats{


	public static void main(String[] args){

		
		// formatação para valores em cada país
		
		Locale localePT = new Locale("pt", "BR");
		Locale localeJP = Locale.JAPAN;
		Locale localeIT = Locale.ITALY;


		NumberFormat[] nfa = new NumberFormat[4];
		nfa[0] = NumberFormat.getInstance();
		nfa[1] = NumberFormat.getInstance(localePT);
		nfa[2] = NumberFormat.getInstance(localeJP);
		nfa[3] = NumberFormat.getInstance(localeIT);


		double valor = 10_000.2130;


		for (NumberFormat numberFormat : nfa){
			
			System.out.println(numberFormat.getMaximumFractionDigits());
			System.out.println(numberFormat.format(valor));
		}
		
		
		
		
	System.out.println();
		
		// 10_000.2130    [ _ ]  é considerado texto e inválida o resto da numeração.
		String valoString = "10.000,21";

		try{

			System.out.println("Valor da moeda do país  " + nfa[0].parse(valoString));
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
