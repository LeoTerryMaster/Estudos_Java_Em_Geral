package XTI.src.poo.media;

public class Medias{


	//metodos de sobrecarga

	double media(int x,int y){
		System.out.print("Média (int x,int y) ");

		return (x + y) / 2;

	}

	double media(String x,String y){
		System.out.print("Média (String x,String y) ");

		int a = Integer.parseInt(x);
		int b = Integer.parseInt(y);
		int redultado = (a + b) / 2;

		return redultado;
	}

	double media(int... numeros){
		System.out.print("Média (int ... numeros) ");

		int soma = 0;
		for (int n : numeros){
			soma += n;
		}
		return soma / 2;

	}

}
