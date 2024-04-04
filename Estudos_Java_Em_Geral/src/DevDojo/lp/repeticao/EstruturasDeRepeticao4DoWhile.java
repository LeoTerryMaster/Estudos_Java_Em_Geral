package DevDojo.lp.repeticao;

public class EstruturasDeRepeticao4DoWhile{

	// while, do while e for


	public static void main(String[] args) throws InterruptedException{

		// nesta condição entrea pelo menos 1 vez
		int count=0;
		
		do{
			System.out.println("Dentro do do while "+ count);
			count++;
		}while(count<10);
	}

}
