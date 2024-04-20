package DevDojo.poo.orientacaoobjeto.blocodeinicializacao2;

public class Anime{

	private String nome;
	private static int[] epsodios;

// 0 - Bloco de inicializacao é executado quando a JVM carregar a classe
	// 1 - Alocado espaco em memória
	// 2 - cada atributo de classe é criado e inicializado com valores dedault ou que for passado
	// 3 - Bloco de inicializaćão é executado
	// 4 - Construtor é executado 
	// 5 - Bloco de inicializacao sempre é executado

	static{
		epsodios = new int[100];
		for (int i = 0; i < epsodios.length; i++){
			epsodios[i] = i + 1;

		}
		System.out.println("Dentro do Bloco");
	}

	public Anime(){


		for (int i : Anime.epsodios){
			System.out.print(i + " ");
		}
		System.out.println();
	}


	public Anime(String nome){
		this.nome = nome;
	}


	public String getNome(){
		return nome;
	}


	public static int[] getEpsodios(){
		return Anime.epsodios;
	}


}
