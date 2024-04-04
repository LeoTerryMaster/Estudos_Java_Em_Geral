package DevDojo.lp.repeticao;

public class FlucoFor5{


	public static void main(String[] args){

		double valor_total = 30000;

		for (int parcela = 1; parcela <= valor_total; parcela++){
			double valor_parcela = valor_total / parcela;
			if(valor_parcela < 1000){
				continue;
			}
			System.out.println("Parcalas " + parcela + " R$ " + valor_parcela);
		}

	}

}
