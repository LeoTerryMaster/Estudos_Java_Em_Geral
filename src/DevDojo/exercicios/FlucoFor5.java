package DevDojo.exercicios;

public class FlucoFor5{


	public static void main(String[] args){

		double valor_total = 30000;

		for (int parcela = (int) valor_total; parcela >= 1; parcela--){
			double valor_parcela = valor_total / parcela;
			if(valor_parcela < 1000){
				continue;
			}
			System.out.println("Parcalas " + parcela + " R$ " + valor_parcela);
		}

	}

}
