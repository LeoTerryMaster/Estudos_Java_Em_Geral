package XTI.src.logica.Fluxo;

public class FluxosIfElse2{

	public static void main(String[] args){

		int idade = 17;


		if(idade > 3 && idade <= 7){
			System.out.println("É um Bebe...");
		}else if(idade >= 12 && idade < 18){
			System.out.println("É um Adolescente...");
		}else if(idade >= 18 && idade < 60){
			System.out.println("É um Adulto..");
		}else if(idade >= 60 && idade < 90){
			System.out.println("É um Jovem Idoso..");
		}else{
			System.out.println("É um Idoso..-");
		}

	


	}

}
