package XTI.src.logica.operadores;

public class OperadoresDeComparacao{


	public static void main(String[] args){
		// opeeradores de comparação

		Integer a = 10;


		System.out.println("a == 10: " + (a == 10)); // Igualdade
		System.out.println("a != 10: " + (a != 10)); // Desigualdade	
		System.out.println("a > 5: " + (a > 5)); // Maior que
		System.out.println("a < 15: " + (a < 15)); // Menor que
		System.out.println("a >= 10: " + (a >= 10)); // Maior ou igual a
		System.out.println("a <= 10: " + (a <= 10)); // Menor ou igual a

		System.out.println("a == 10 && a < 15: " + (a == 10 && a < 15)); // E lógico
		System.out.println("a == 10 || a < 5: " + (a == 10 || a < 5)); // Ou lógico
		System.out.println("!(a == 10): " + !(a == 10)); // Negação lógica
		System.out.println("a == 10 ? \"Sim\" : \"Não\": " + (a == 10 ? "Sim" : "Não")); // Operador ternário
		System.out.println(a instanceof Integer); // Verifica se 'a' é uma instância de Integer	
		System.out.println("a == null: " + (a == null)); // Verifica se 'a' é nulo
		System.out.println("a != null: " + (a != null)); // Verifica se 'a' não é nulo
		System.out.println("a.equals(10): " + a.equals(10)); // Verifica igualdade de valor
		System.out.println("a.compareTo(10): " + a.compareTo(10)); // Compara 'a' com 10, retorna 0 se igual, <0 se 'a' é menor, >0 se 'a' é maior
		System.out.println("a.compareTo(5): " + a.compareTo(5)); // Compara 'a' com 5, retorna 0 se igual, <0 se 'a' é menor, >0 se 'a' é maior
		System.out.println("a.compareTo(15): " + a.compareTo(15)); // Compara 'a' com 15, retorna 0 se igual, <0 se 'a' é menor, >0 se 'a' é maior


	}

}
