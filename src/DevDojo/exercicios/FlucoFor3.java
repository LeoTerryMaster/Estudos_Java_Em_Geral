package DevDojo.exercicios;

public class FlucoFor3{


	public static void main(String[] args){

		double valor_total = 30000;

		for (int parcela = 1; parcela <= valor_total; parcela++){
			double valor_parcela = valor_total / parcela;
			if(valor_parcela >= 1000){
				System.out.print("Parcalas " + parcela + "R$ " + valor_parcela);
			}else {
				break;
			}
			System.out.println("\nfora da parcela " + parcela);
		}

	}

}
