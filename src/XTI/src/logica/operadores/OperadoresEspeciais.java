package XTI.src.logica.operadores;

public class OperadoresEspeciais{


	public static void main(String[] args){


		int idade = 18;

		String maioridade = (idade >= 18) ? "Maior de idade" : "Menor de idade";

		System.out.println(maioridade);

		
		double PI = Math.PI;
		
		String piFormatado = String.format("%.2f", PI);
		
		System.out.println(piFormatado);
	}

}
