package DevDojo.poo.orientacaoobjeto.blocodeinicializacao;

public class Anime{

	private String nome;
	private int[] epsodios;


	// 1 - Alocado espaco em memória
	// 2 - cada atributo de classe é criado e inicializado com valores dedault ou que for passado
	// 3 - Bloco de inicializaćão é executado
	// 4 - Construtor é executado 
	// 5 - Bloco de inicializacao sempre é executado

	{
		epsodios = new int[100];
		for (int i = 0; i < epsodios.length; i++){
			epsodios[i] = i + 1;

		}
	}

	public Anime(){


		for (int i : epsodios){
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


	public int[] getEpsodios(){
		return epsodios;
	}


}
