package XTI.src.logica;


public class Variaveis{

	
	public static void main(String[] args){
		
		
		int idade = 30;
		double salario = 2500.50;
		char letra = 'A';
		boolean ativo = true;
		
		System.out.println("Idade: " + idade);
		System.out.println("Salário: " + salario);
		System.out.println("Letra: " + letra);
		System.out.println("Ativo: " + ativo);
		
		String nome = "João";
		System.out.println("Nome: " + nome);
		
		int[][] numeros = {{1, 2, 3, 4, 5},{1, 2, 3, 4, 5}};
		System.out.print("Números: ");
		for (int numero : numeros[2]) {
			System.out.print(numero + " ");
		}
	}
}
