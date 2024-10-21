package DevDojo.poo.datas.local;

import java.util.Locale;

public class Local2{


	public static void main(String[] args){


		System.out.println("Retorna a linguagem do país  "+Locale.getDefault());


		String[] isoCountries = Locale.getISOCountries();
		String[] isoLanguage = Locale.getISOLanguages();


		for (String il : isoLanguage){
			System.out.print(il + " ");
		}

		System.out.println();

		for (String ic : isoCountries){
			System.out.print(ic + " ");
		}
	}

}
