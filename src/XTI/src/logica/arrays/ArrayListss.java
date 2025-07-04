package XTI.src.logica.arrays;

import java.util.ArrayList;

public class ArrayListss{


	public static void main(String[] args){

		// arraylist


		ArrayList<String> lista = new ArrayList<>();


		lista.add("Leandro");
		lista.add("B");
		lista.add("C");


		for (String string : lista){
			System.out.println(" " + string);
		}


		// remover
		System.out.println("Tamanho da lista: " + lista.size());
		lista.remove(1); // Remove o elemento na posição 1 (segundo elemento)
		System.out.println("Tamanho da lista após remoção: " + lista.size());


		// adicionar
		lista.add(1, "D"); // Adiciona "D" na posição 1
		System.out.println("Tamanho da lista após adição: " + lista.size());
		System.out.println("toString " + lista.toString());
		System.out.println(" acessar a primeira possição " + lista.get(1)); // Acessa o primeiro elemento da lista
		System.out.println(lista.size());// Imprime o tamanho da lista
		System.out.println("Lista contém 'Leandro'? " + lista.contains("Leandro")); // Verifica se a lista contém "Leandro"
		System.out.println(lista.isEmpty()); // Verifica se a lista está vazia
		System.out.println(lista.indexOf("C")); // Retorna o índice do elemento "C"
		

	}

}
