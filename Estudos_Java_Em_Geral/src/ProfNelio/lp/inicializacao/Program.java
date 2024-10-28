package ProfNelio.lp.inicializacao;

public class Program{


	public static void main(String[] args){


		double price = 400.00;

		double discount;// se não for inicializada 

		if(price <= 200.0){
			discount = price * 0.1;
		}else{
			discount = 0; //posso fazer dessa maneira no fluxo condicional 

		}

		System.out.println(discount);
	}

}
