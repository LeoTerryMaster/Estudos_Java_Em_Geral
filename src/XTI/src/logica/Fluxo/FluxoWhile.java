package XTI.src.logica.Fluxo;


public class FluxoWhile{

	
	public static void main(String[] args){
		
		int contador = 0;
		
		while(contador < 10){
			System.out.println("Contador: " + contador);
			contador++;
		}
		
		System.out.println("Fim do loop while");
		
		do {
			System.out.println("Contador: " + contador);
			contador++;
		} while(contador < 20);
		
		System.out.println("Fim do loop do-while");
		
		for(int i = 0; i < 10; i++){
			System.out.println("Contador: " + i);
		}
		
		System.out.println("Fim do loop for");
	}
}
