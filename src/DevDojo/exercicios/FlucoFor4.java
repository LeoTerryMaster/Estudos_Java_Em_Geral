package DevDojo.exercicios;

public class FlucoFor4{


	public static void main(String[] args){

		double valor_total = 30000;

		for (int parcela = 1; parcela <= valor_total; parcela++){
			double valor_parcela = valor_total / parcela;
			if(valor_parcela < 1000){
				break;
			}
			System.out.println("Parcalas " + parcela + " R$ " + valor_parcela);
		}

	}

}
