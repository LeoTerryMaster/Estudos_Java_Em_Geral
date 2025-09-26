package XTI.src.lp.oiperadoresespeciais;

public class OperadoresEspeciais2{


	public static void main(String[] args){

		int idade = 9;


		String resultado = (idade <= 7) ? "é uma criança" : (idade <= 12) ? "puberdade" : (idade <= 18) ? "adolescente" : " adulto";

		System.out.println("resultado é : " + resultado);

	}

}
