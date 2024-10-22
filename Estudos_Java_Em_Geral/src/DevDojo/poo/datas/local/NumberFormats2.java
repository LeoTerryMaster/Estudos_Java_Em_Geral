package DevDojo.poo.datas.local;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormats2{


	public static void main(String[] args){


		// formatação para moedas em cada país

		Locale localePT = new Locale("pt", "BR");
		Locale localeJP = Locale.JAPAN;
		Locale localeIT = Locale.ITALY;


		NumberFormat[] nfa = new NumberFormat[4];
		nfa[0] = NumberFormat.getCurrencyInstance();
		nfa[1] = NumberFormat.getCurrencyInstance(localePT);
		nfa[2] = NumberFormat.getCurrencyInstance(localeJP);
		nfa[3] = NumberFormat.getCurrencyInstance(localeIT);


		double valor = 10_000.2130;


		for (NumberFormat numberFormat : nfa){

			System.out.println(numberFormat.getMaximumFractionDigits());
			System.out.println(numberFormat.format(valor));
		}

		
		System.out.println();
		
		// 10_000.2130    [ _ ]  é considerado texto e inválida o resto da numeração.
		String valoString = "R$ 10.000,21";

		try{

			System.out.println("Valor da moeda do país  " + nfa[0].parse(valoString));
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
